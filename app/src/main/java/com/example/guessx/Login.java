package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    public static String nameInp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void startClicked(View v){
        EditText name = (EditText) findViewById(R.id.nameInput);
        nameInp = name.getText().toString();
        if(nameInp.length() == 0){
            ;
        }
        else{
            startActivity(new Intent(Login.this, Difficulty.class));
        }
    }
}