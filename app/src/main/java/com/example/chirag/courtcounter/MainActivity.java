package com.example.chirag.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsA= 0;
    int pointsB= 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void show3points(View view) {
        pointsA +=3;
        displayForTeamA(pointsA);
    }

    public void show2points(View view) {
        pointsA +=2;
        displayForTeamA(pointsA);
    }

    public void show1points(View view) {
        pointsA +=1;

        displayForTeamA(pointsA);
    }
    public void show3pointsB(View view) {
        pointsB +=3;
        displayForTeamB(pointsB);
    }

    public void show2pointsB(View view) {
        pointsB +=2;
        displayForTeamB(pointsB);
    }

    public void show1pointsB(View view) {
        pointsB +=1;
        displayForTeamB(pointsB);
    }

    public void playAgain(View view) {
        pointsA = 0;
        pointsB = 0;
        displayForTeamA(pointsA);
        displayForTeamB(pointsB);
    }
}
