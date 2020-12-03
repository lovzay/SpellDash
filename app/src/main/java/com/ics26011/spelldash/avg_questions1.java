package com.ics26011.spelldash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.widget.ProgressBar;

public class avg_questions1 extends AppCompatActivity {

    private ProgressBar easyProgressBar;
    private CountDownTimer easyCountDownTimer;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avg_questions1);

        easyProgressBar=(ProgressBar)findViewById(R.id.timerbar);
        easyProgressBar.setProgress(i);
        easyCountDownTimer=new CountDownTimer(15000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.v("Log_tag", "Tick of Progress"+ i+ millisUntilFinished);
                i++;
                easyProgressBar.setProgress((int)i*100/(15000/1000));

            }


            @Override
            public void onFinish()
            {
                openAvgResults1();
                i++;
                easyProgressBar.setProgress(100);

            }
        };
        easyCountDownTimer.start();


    }


    public void openAvgResults1() {
        Intent intent = new Intent(this, avg_results1.class);
        startActivity(intent);
    }
}