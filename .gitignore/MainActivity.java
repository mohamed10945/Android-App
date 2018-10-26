package com.example.mohamed_saaied.score;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ascore=0;
    int bscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void ___a(View v){
        ascore = ascore +3;
        displayForTeamA(ascore);
    }
    public void __a(View v){
        ascore = ascore +2;
        displayForTeamA(ascore);
    }
    public void _a(View v){
        ascore = ascore +1;
        displayForTeamA(ascore);
    }
    public void ___b(View v){
        bscore = bscore +3;
        displayForTeamB(bscore);
    }
    public void __b(View v){
        bscore = bscore +2;
        displayForTeamB(bscore);
    }
    public void _b(View v){
        bscore = bscore +1;
        displayForTeamB(bscore);
    }
    public void Resat(View v){
        ascore =0;
        bscore=0;
        displayForTeamB(bscore);
        displayForTeamA(ascore);
    }

}
