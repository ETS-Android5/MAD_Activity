package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tutorial_03_Activity02 extends AppCompatActivity {

    EditText t_num1;
    EditText t_num2;
    TextView tv_answer;

    String number1;
    String number2;

    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial0302);

        t_num1 = findViewById(R.id.t_num1);
        t_num2 = findViewById(R.id.t_num2);
        tv_answer = findViewById(R.id.tv_answer);

        Intent intent = getIntent();

        //receive value
        number1 = intent.getStringExtra("num1");
        number2 = intent.getStringExtra("num2");

        t_num1.setText(number1);
        t_num2.setText(number2);

        num1 = Integer.parseInt(number1);
        num2 = Integer.parseInt(number2);
    }

    //Calculation
    public void add (View view){
        tv_answer.setText(number1 + "+" + number2 + "+" + (num1+num2));
    }

    public void subtract (View view){
        tv_answer.setText(number1 + "-" + number2 + "-" + (num1-num2));
    }

    public void multiply (View view){
        tv_answer.setText(number1 + "*" + number2 + "*" + (num1*num2));
    }

    public void divide (View view){
        tv_answer.setText(number1 + "/" + number2 + "/" + (num1/num2));
    }
}