package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tA3(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    public void tA2(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void tALl(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void tB3(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void tB2(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void tBLl(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
