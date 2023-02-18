package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Game extends AppCompatActivity {
    private int randomNum;
    private Button guessNumber;
    private int lives = 9;
    public static int streak = 0;
    public static int score = 0;
    public static int highscore;
    String low = "Try guessing lower!";
    String high = "Try guessing higher!";
    private String strNum;
    private final String YES = "Correct!" + "\n" + "Guess a new number!";
    private final String NO = "Incorrect!";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        randomNum();
        strNum = String.valueOf(randomNum);
        ((TextView) findViewById(R.id.lifeCount)).setText(String.valueOf("Lives left: " + lives));
        ((TextView) findViewById(R.id.streak)).setText(String.valueOf("Streak: " + streak));
        guessNumber = (Button) findViewById(R.id.guessNum);

    }
    public void buttonClicked(View v){
        EditText input = (EditText) findViewById(R.id.guessInput);
        String inputStr = input.getText().toString();
        if(inputStr.length() == 0){
            inputStr = "0";
        }
        if(inputStr.equals(strNum)){
            ((TextView) findViewById(R.id.guess)).setText(YES);
            ((TextView) findViewById(R.id.hint)).setText("");
            streak++;
            score++;
            randomNum();
            strNum = String.valueOf(randomNum);
        }
        else{
            ((TextView) findViewById(R.id.guess)).setText(NO);
            streak = 0;
            lives--;
            int n = Integer.parseInt(inputStr);
            if(n > randomNum){
                ((TextView) findViewById(R.id.hint)).setText(low);
            }
            if(n < randomNum){
                ((TextView) findViewById(R.id.hint)).setText(high);
            }
        }
        ((TextView) findViewById(R.id.lifeCount)).setText(String.valueOf("Lives left: " + lives));
        ((TextView) findViewById(R.id.streak)).setText(String.valueOf("Streak:" + streak));
        if(lives == 0){
            guessNumber.setEnabled(false);
            startActivity(new Intent(Game.this, PlayAgain.class));
        }
    }
    public void randomNum(){
        if(Difficulty.isCustom){
            randomNum = (int)((Math.random() * (CustomRange.maxNum - CustomRange.minNum)) + CustomRange.minNum);
        }
        else{
            randomNum = (int)((Math.random() * (Difficulty.max - Difficulty.min)) + Difficulty.min);
        }
    }
}