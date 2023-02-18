package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void loginClicked(View v){
        startActivity(new Intent(MainActivity.this, Login.class));
    }
    public void exitClicked(View v){
        finishAffinity();
        System.exit(0);
    }
    public void instructionsClicked(View v){
        startActivity(new Intent(MainActivity.this, Instructions.class));
    }

    public void backToMenuInstructions (View v) {
        startActivity(new Intent(MainActivity.this, MainActivity.class));
    }
}