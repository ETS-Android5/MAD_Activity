package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Tutorial_03 extends AppCompatActivity {

    EditText t_num1;
    EditText t_num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial03);

        t_num1 = findViewById(R.id.t_num1);
        t_num2 = findViewById(R.id.t_num2);
    }

    //navigation part
    public void openSecond(View view){
        Intent intent = new Intent(this ,Tutorial_03_Activity02.class);

        String num1 = t_num1.getText().toString();
        String num2 = t_num2.getText().toString();

        intent.putExtra("num1",num1);
        intent.putExtra("num2",num2);

        //layout
        LayoutInflater li = getLayoutInflater();
        View layout = li.inflate(R.layout.custom_toast,findViewById(R.id.te_calculater));

        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setView(layout);
        toast.show();

        startActivity(intent);
    }
}