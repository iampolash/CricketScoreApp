package com.example.android.cricketscoreapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int wicketTeamA = 0;
    int wideTeamA = 0;
    int noBallTeamA = 0;
    int legByTeamA = 0;
    int scoreTeamB = 0;
    int wicketTeamB = 0;
    int wideTeamB = 0;
    int noBallTeamB = 0;
    int legByTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * When this button clicked it shows 1 wicket for Team A
     */
    public void addOneWicketForTeamA(View v) {
        wicketTeamA += 1;
        if (wicketTeamA <= 10) {
            displayWicketForTeamA(wicketTeamA);
        }
    }

    /**
     * When this button clicked it shows score of wide = 1  to TeamA Also Updates Wide
     */
    public void addWideForTeamA(View v) {
        wideTeamA += 1;
        scoreTeamA += 1;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
            displayWideTeamA(wideTeamA);
        }

    }


    /**
     * When this button clicked it shows score of No Ball = 1  to TeamA Also Updates No Ball
     */
    public void addNoBallForTeamA(View v) {
        noBallTeamA += 1;
        scoreTeamA += 1;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
            displayNoBallTeamA(noBallTeamA);
        }
    }

    /**
     * When this button clicked it shows score of Leg By = 1  to TeamA also Updates to Leg By
     */
    public void addLegByForTeamA(View v) {
        legByTeamA += 1;
        scoreTeamA += 1;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
            displayLegByTeamA(legByTeamA);
        }

    }

    /**
     * When this button clicked it increase score by 1 to TeamA
     */
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * When this button clicked it increase score by 2 to TeamA
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * When this button clicked it increase score by 3 to TeamA
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * When this button clicked it increase score by 4 to TeamA
     */
    public void addFourforTeamA(View v) {
        scoreTeamA += 4;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * When this button clicked it increase score by 6 to TeamA
     */
    public void addSixforTeamA(View v) {
        scoreTeamA += 6;
        if (wicketTeamA < 10) {
            displayForTeamA(scoreTeamA);
        }
    }


    /**
     * Displays the given wicket for Team A.
     */
    public void displayWicketForTeamA(int wicket) {
        TextView wicketView = (TextView) findViewById(R.id.team_a_wicket_s_text_view);
        wicketView.setText(wicket + "/10");
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    /**
     * Displays the wide score for Team A.
     */
    public void displayWideTeamA(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_a_wide_s_text_view);
        extraRuns.setText("" + extraScore);
    }

    /**
     * Displays the noball score for Team A.
     */
    public void displayNoBallTeamA(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_a_no_ball_s_text_view);
        extraRuns.setText("" + extraScore);
    }


    /**
     * Displays the Leg by score for Team A.
     */
    public void displayLegByTeamA(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_a_leg_by_s_text_view);
        extraRuns.setText("" + extraScore);
    }

// Team B Functions Starts From here

    /**
     * When this button clicked it shows 1 wicket for Team B
     */
    public void addOneWicketForTeamB(View v) {
        wicketTeamB += 1;
        if (wicketTeamB <= 10) {
            displayWicketForTeamB(wicketTeamB);
        }
    }

    /**
     * When this button clicked it shows score of wide = 1  to TeamB Blso Updates Wide
     */
    public void addWideForTeamB(View v) {
        wideTeamB += 1;
        scoreTeamB += 1;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
            displayWideTeamB(wideTeamB);
        }
    }


    /**
     * When this button clicked it shows score of No Ball = 1  to TeamB Blso Updates No Ball
     */
    public void addNoBallForTeamB(View v) {
        noBallTeamB += 1;
        scoreTeamB += 1;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
            displayNoBallTeamB(noBallTeamB);
        }
    }

    /**
     * When this button clicked it shows score of Leg By = 1  to TeamB also Updates to Leg By
     */
    public void addLegByForTeamB(View v) {
        legByTeamB += 1;
        scoreTeamB += 1;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
            displayLegByTeamB(legByTeamB);
        }
    }

    /**
     * When this button clicked it increase score by 1 to TeamB
     */
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * When this button clicked it increase score by 2 to TeamB
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * When this button clicked it increase score by 3 to TeamB
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * When this button clicked it increase score by 4 to TeamB
     */
    public void addFourforTeamB(View v) {
        scoreTeamB += 4;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * When this button clicked it increase score by 6 to TeamB
     */
    public void addSixforTeamB(View v) {
        scoreTeamB += 6;
        if (wicketTeamB < 10) {
            displayForTeamB(scoreTeamB);
        }
    }


    /**
     * Displays the given wicket for Team B.
     */
    public void displayWicketForTeamB(int wicket) {
        TextView wicketView = (TextView) findViewById(R.id.team_b_wicket_s_text_view);
        wicketView.setText(wicket + "/10");
    }


    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }

    /**
     * Displays the wide score for Team B.
     */
    public void displayWideTeamB(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_b_wide_s_text_view);
        extraRuns.setText("" + extraScore);
    }

    /**
     * Displays the noball score for Team B.
     */
    public void displayNoBallTeamB(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_b_no_ball_s_text_view);
        extraRuns.setText("" + extraScore);
    }


    /**
     * Displays the Leg by score for Team B.
     */
    public void displayLegByTeamB(int extraScore) {
        TextView extraRuns = (TextView) findViewById(R.id.team_b_leg_by_s_text_view);
        extraRuns.setText("" + extraScore);
    }


    /**
     * When this button clicked it Reset the result and set score to 0
     */
    public void reset(View v) {
        scoreTeamA = 0;
        wicketTeamA = 0;
        wideTeamA = 0;
        noBallTeamA = 0;
        legByTeamA = 0;
        scoreTeamB = 0;
        wicketTeamB = 0;
        wideTeamB = 0;
        noBallTeamB = 0;
        legByTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayWicketForTeamA(wicketTeamA);
        displayWideTeamA(wideTeamA);
        displayNoBallTeamA(noBallTeamA);
        displayLegByTeamA(legByTeamA);
        displayForTeamB(scoreTeamB);
        displayWicketForTeamB(wicketTeamB);
        displayWideTeamB(wideTeamB);
        displayNoBallTeamB(noBallTeamB);
        displayLegByTeamB(legByTeamB);
    }
}
