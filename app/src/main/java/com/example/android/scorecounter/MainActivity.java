package com.example.android.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    double shotsTeamA = 0;
    double shotsTeamB = 0;
    int exclusionTeamA = 0;
    int exclusionTeamB = 0;
    double efficiencyTeamA = 0;
    double efficiencyTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the goals for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
        shotsTeamA = shotsTeamA + 1;
        efficiencyTeamA = Math.round(scoreTeamA / shotsTeamA * 100);
        displayGoalEffForTeamA(efficiencyTeamA);
    }

    /**
     * add shots for Team A.
     */
    public void addShotsForTeamA(View v) {
        shotsTeamA = shotsTeamA + 1;
        efficiencyTeamA = Math.round(scoreTeamA / shotsTeamA * 100);
        displayGoalEffForTeamA(efficiencyTeamA);
    }

    /**
     * Add exclusion for Team A.
     */
    public void incrementExclusionForTeamA(View v) {
        exclusionTeamA = exclusionTeamA + 1;
        displayExclusionForTeamA(exclusionTeamA);
    }

    /**
     * Increase the goals for Team B by 1 point.
     */

    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        shotsTeamB = shotsTeamB + 1;
        efficiencyTeamB = Math.round(scoreTeamB / shotsTeamB * 100);
        displayGoalEffForTeamB(efficiencyTeamB);
    }

    /**
     * Increase the efficiency for Team B.
     */
    public void addShotsForTeamB(View v) {
        shotsTeamB = shotsTeamB + 1;
        efficiencyTeamB = Math.round(scoreTeamB / shotsTeamB * 100);
        displayGoalEffForTeamB(efficiencyTeamB);
    }

    /**
     * Decrease the efficiency for Team B.
     */
    public void incrementExclusionForTeamB(View v) {
        exclusionTeamB = exclusionTeamB + 1;
        displayExclusionForTeamB(exclusionTeamB);
    }

    /**
     * Reset values
     */
    public void resetAB(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        exclusionTeamA = 0;
        exclusionTeamB = 0;
        efficiencyTeamA = 0;
        efficiencyTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayExclusionForTeamA(exclusionTeamA);
        displayExclusionForTeamB(exclusionTeamB);
        displayGoalEffForTeamA(efficiencyTeamA);
        displayGoalEffForTeamB(efficiencyTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the efficiency for Team A.
     */
    public void displayGoalEffForTeamA(double score) {

        TextView effView = (TextView) findViewById(R.id.team_a_efficiency);
        effView.setText(String.valueOf(score)+ "%");
    }

    /**
     * Displays exclusion for Team B.
     */
    public void displayExclusionForTeamA(int score) {
        TextView effView = (TextView) findViewById(R.id.team_a_exclusion);
        effView.setText(String.valueOf(score));
    }

    /**
     * Displays exclusion for Team B.
     */
    public void displayExclusionForTeamB(int score) {
        TextView effView = (TextView) findViewById(R.id.team_b_exclusion);
        effView.setText(String.valueOf(score));
    }

    /**
     * Displays the efficiency for Team B.
     */
    public void displayGoalEffForTeamB(double score) {
        TextView effView = (TextView) findViewById(R.id.team_b_efficiency);
        effView.setText(String.valueOf(score)+ "%");
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}