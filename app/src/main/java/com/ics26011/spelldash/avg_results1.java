package com.ics26011.spelldash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class avg_results1 extends AppCompatActivity {

    private Button menuButton;
    private Button advToDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg_results1);

        menuButton = (Button)findViewById(R.id.choose_avgmenu_btn);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

        advToDiff = (Button)findViewById(R.id.advance_avg_btn);
        advToDiff.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                openDiffQuestions1();
            }
        });

    }

    public void openMenu(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openDiffQuestions1(){
        Intent intent = new Intent(this, diff_questions1.class);
        startActivity(intent);
    }
}