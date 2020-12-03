package com.ics26011.spelldash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class easy_results1 extends AppCompatActivity {

    private Button menuButton;
    private Button advToAvg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_results1);

        menuButton = (Button)findViewById(R.id.choose_easymenu_btn);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

        advToAvg = (Button)findViewById(R.id.advance_easy_btn);
        advToAvg.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openAvgQuestions1();
            }
        });

    }

    public void openMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openAvgQuestions1(){
        Intent intent = new Intent(this, avg_questions1.class);
        startActivity(intent);
    }
}