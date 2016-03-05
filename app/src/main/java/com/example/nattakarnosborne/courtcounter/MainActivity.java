package com.example.nattakarnosborne.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int teamAscore = 0;
    int teamBscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }


    /**
     * This method is called when a team A 3points button is clicked.
     */
    public void Team_A_increment3(View view) {

        teamAscore = teamAscore +3;
        displayForTeamA(teamAscore);
    }

    /**
     * This method is called when a team A 2points button is clicked.
     */
    public void Team_A_increment2(View view) {

        teamAscore = teamAscore +2;
        displayForTeamA(teamAscore);
    }

    /**
     * This method is called when a team A free throw button is clicked.
     */
    public void Team_A_free_throw(View view) {

        teamAscore = teamAscore +1;
        displayForTeamA(teamAscore);
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }


    /**
     * This method is called when a team B 3points button is clicked.
     */
    public void Team_B_increment3(View view) {

        teamBscore = teamBscore +3;
        displayForTeamB(teamBscore);
    }

    /**
     * This method is called when a team B 2points button is clicked.
     */
    public void Team_B_increment2(View view) {

        teamBscore = teamBscore +2;
        displayForTeamB(teamBscore);
    }

    /**
     * This method is called when a team B free throw button is clicked.
     */
    public void Team_B_free_throw(View view) {

        teamBscore = teamBscore +1;
        displayForTeamB(teamBscore);
    }


    /**
     * This method is called when a team B free throw button is clicked.
     */
    public void reset(View view) {

        teamAscore = 0;
        teamBscore = 0;
        displayForTeamA(teamAscore);
        displayForTeamB(teamBscore);
    }

}
