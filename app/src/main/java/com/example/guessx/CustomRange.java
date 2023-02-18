package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CustomRange extends AppCompatActivity {
    String min;
    String max;
    public static int minNum;
    public static int maxNum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_range);
    }
    public void startCustom (View v){
        EditText num1 = (EditText) findViewById(R.id.minInput);
        EditText num2 = (EditText) findViewById(R.id.maxInput);
        min = num1.getText().toString();
        max = num2.getText().toString();
        minNum = Integer.parseInt(min);
        maxNum = Integer.parseInt(max);
        startActivity(new Intent(CustomRange.this, Game.class));
    }
}