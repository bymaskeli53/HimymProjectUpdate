package com.muhammetgundogar.himymproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
        private CheckBox checkBox,checkBox2,checkBox3,checkBox4,checkBox5;
        private Button buttonScore;
        private ConstraintLayout constraintLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox=findViewById(R.id.checkBox);
        checkBox2=findViewById(R.id.checkBox2);
        checkBox3=findViewById(R.id.checkBox3);
        checkBox4=findViewById(R.id.checkBox4);
        checkBox5=findViewById(R.id.checkBox5);
        buttonScore=findViewById(R.id.buttonScore);
        constraintLayout=findViewById(R.id.constrainLayout);

        buttonScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,ScoreActivity.class);
                startActivity(intent);
            }
        });





    }

    @Override
    protected void onStart() {
//        Toast.makeText(getApplicationContext(),"Remember Barney is the hardest character",Toast.LENGTH_LONG).show();
        Snackbar.make(constraintLayout,"Remember Barney is the hardest character",1300).show();
        super.onStart();
    }

    public void onCheckboxClicked(View view) {

        switch(view.getId()) {

            case R.id.checkBox:

                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);

                break;

            case R.id.checkBox2:

                checkBox3.setChecked(false);
                checkBox.setChecked(false);
                checkBox4.setChecked(false);
                checkBox5.setChecked(false);

                break;

            case R.id.checkBox3:

                checkBox.setChecked(false);
                checkBox2.setChecked(false);
                checkBox5.setChecked(false);
                checkBox4.setChecked(false);

                break;
            case R.id.checkBox4:
                checkBox2.setChecked(false);
                checkBox.setChecked(false);
                checkBox5.setChecked(false);
                checkBox3.setChecked(false);

                break;

            case R.id.checkBox5:
                checkBox.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);
                checkBox4.setChecked(false);

                break;
        }
    }
    public void changeScreen(View view){
       if (checkBox.isChecked()){
           Intent intentToBarney=new Intent(MainActivity.this, BarneyActivity.class);
            startActivity(intentToBarney);
       }
       else if(checkBox3.isChecked()){
           Intent intentToMarshall=new Intent(MainActivity.this, MarshallActivity.class);
           startActivity(intentToMarshall);

       }
       else if(checkBox2.isChecked()){
           Intent intentToLily=new Intent(MainActivity.this, LilyActivity.class);
           startActivity(intentToLily);
       }
       else if(checkBox4.isChecked()){
           Intent intentToTed=new Intent(MainActivity.this, TedActivity.class);
           startActivity(intentToTed);
       }
       else if(checkBox5.isChecked()){
           Intent intentToRobin=new Intent(MainActivity.this, RobinActivity.class);
           startActivity(intentToRobin);
       }
    }}






