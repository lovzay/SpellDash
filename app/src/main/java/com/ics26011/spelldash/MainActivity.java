package com.ics26011.spelldash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button easyButton;
    private Button avgButton;
    private Button diffButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        easyButton = (Button)findViewById(R.id.menu_easy_btn);
        easyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openEasyQuestions1();
            }
        });

        avgButton = (Button)findViewById(R.id.menu_avg_btn);
        avgButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAvgQuestions1();
            }
        });

        diffButton = (Button)findViewById(R.id.menu_diff_btn);
        diffButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                openDiffQuestions1();
            }
        });

    }

    public void openEasyQuestions1() {
        Intent intent = new Intent(this, EasyQuestions1.class);
        startActivity(intent);
    }

    public void openAvgQuestions1(){
        Intent intent = new Intent(this, avg_questions1.class);
        startActivity(intent);
    }

    public void openDiffQuestions1(){
        Intent intent = new Intent(this, diff_questions1.class);
        startActivity(intent);
    }
}