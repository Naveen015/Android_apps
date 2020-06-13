package com.example.naveen.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=1;
    int scoreB=1;

    public void resetScore(View view){
        scoreA=1;
        scoreB=1;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
    public void scoreThree_A(View view){
        scoreA=scoreA+3;
        display_A(scoreA);
    }
    public void scoreTwo_A(View view){
        scoreA=scoreA+2;
        display_A(scoreA);
    }
    public void scoreFreeThrow_A(View view){
        scoreA=scoreA+1;
        display_A(scoreA);
    }
    public void display_A (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_a_score);
        countViewer.setText(""+ number);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scoreThree_B(View view){
        scoreB=scoreB+3;
        display_B(scoreB);
    }
    public void scoreTwo_B(View view){
        scoreB=scoreB+2;
        display_B(scoreB);
    }
    public void scoreFreeThrow_B(View view){
        scoreB=scoreB+1;
        display_B(scoreB);
    }
    public void display_B (int number){
        TextView countViewer = (TextView)findViewById(R.id.team_b_score);
        countViewer.setText(""+ number);
    }
}

