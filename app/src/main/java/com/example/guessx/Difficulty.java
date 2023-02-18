package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Difficulty extends AppCompatActivity {
    public static int max = 0;
    public static int min = 1;
    public static boolean isCustom = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
    }
    public void easyClicked(View v){
        max = 10;
        startActivity(new Intent(Difficulty.this, Game.class));
    }
    public void mediumClicked(View v){
        max = 50;
        startActivity(new Intent(Difficulty.this, Game.class));
    }
    public void hardClicked(View v){
        max = 100;
        startActivity(new Intent(Difficulty.this, Game.class));
    }
    public void customClicked(View v){
        isCustom = true;
        startActivity(new Intent(Difficulty.this, CustomRange.class));
    }
    public void backToMenuDifficulty (View v){
        startActivity(new Intent(Difficulty.this, MainActivity.class));
    }



}