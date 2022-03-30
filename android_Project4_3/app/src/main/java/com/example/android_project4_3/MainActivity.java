package com.example.android_project4_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.dialog.InsetDialogOnTouchListener;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button1, button2, button3, button4, button5; // +,-,*,/,% 순서대로
    TextView textResult;
    String num1, num2;
    Integer result;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ActionBar에 사진 추가
        ActionBar ab = getSupportActionBar();
        ab.setDisplayShowHomeEnabled(true);
        ab.setDisplayUseLogoEnabled(true);
        ab.setIcon(R.drawable.my2my);
        ab.setTitle("초간단 계산기");

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);

        textResult = (TextView) findViewById(R.id.textResult);

    }
    public void onClick(View view)
    {
        if(editText1.getText().toString().isEmpty()||editText2.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"빈 칸이 있습니다",Toast.LENGTH_SHORT).show();
        }else{
            switch (view.getId()){
                case R.id.button1:
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                    break;
                case R.id.button2:
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                    break;
                case R.id.button3:
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                    break;
                case R.id.button4:
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    if(Integer.parseInt(num2)==0){
                        Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                    break;
                case R.id.button5:
                    num1 = editText1.getText().toString();
                    num2 = editText2.getText().toString();
                    if(Integer.parseInt(num2)==0){
                        Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다",Toast.LENGTH_SHORT).show();
                        break;
                    }
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산결과 : " + result.toString());
                    break;
            }
        }

    }

}