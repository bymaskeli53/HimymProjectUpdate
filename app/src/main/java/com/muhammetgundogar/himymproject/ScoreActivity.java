package com.muhammetgundogar.himymproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

        TextView textViewBarney;
        TextView textViewLily;
        TextView textViewTed;
        TextView textViewRobin;
        TextView textViewMarshall;
        private SharedPreferences sharedPreferences;
        private SharedPreferences.Editor editor;
        private int ScoreBarney;
        private int ScoreLily;
        private int ScoreTed;
        private int ScoreMarshall;
        private int ScoreRobin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        textViewBarney=findViewById(R.id.textViewBarneyScore);
        textViewMarshall=findViewById(R.id.textViewMarshallScore);
        textViewLily=findViewById(R.id.textViewLilyScore);
        textViewTed=findViewById(R.id.textViewTedScore);
        textViewRobin=findViewById(R.id.textViewRobinScore);
        sharedPreferences=this.getSharedPreferences("sharedpreferences", Context.MODE_PRIVATE);


       // Score=sharedPreferences.getString("score","0");
         ScoreBarney=sharedPreferences.getInt("scoreBarney",0);
         ScoreMarshall=sharedPreferences.getInt("scoreMarshall",0);
         ScoreLily=sharedPreferences.getInt("scoreLily",0);
         ScoreTed=sharedPreferences.getInt("scoreTed",0);
         ScoreRobin=sharedPreferences.getInt("scoreRobin",0);
         textViewMarshall.setText(String.valueOf(ScoreMarshall));
         textViewBarney.setText(String.valueOf(ScoreBarney));
         textViewLily.setText(String.valueOf(ScoreLily));
         textViewTed.setText(String.valueOf(ScoreTed));
         textViewRobin.setText(String.valueOf(ScoreRobin));

        /*if (!textView.getText().toString().matches("") && Score>Integer.parseInt(textView.getText().toString())){
         textView.setText(Score);
        return;}*/
        //textView.setText("Score: "+Score);


    }
}