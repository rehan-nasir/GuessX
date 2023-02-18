package com.example.guessx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PlayAgain extends AppCompatActivity {
    String currentScore;
    String hghScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_again);
        if(Game.score > Game.highscore){
            Game.highscore = Game.score;
        }
        currentScore = Login.nameInp + "'s score: " + Game.score;
        hghScore = "Highscore: " + Game.highscore;
        ((TextView) findViewById(R.id.userScore)).setText(currentScore);

    }
    public void playAgainButtonClicked(View v){
        Game.score = 0;
        startActivity(new Intent(PlayAgain.this, Game.class));
    }
    public void backToMenuInstructions (View v) {
        Game.score = 0;
        startActivity(new Intent(PlayAgain.this, MainActivity.class));
    }
}