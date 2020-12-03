package com.ics26011.spelldash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class EasyQuestions1 extends AppCompatActivity {

    private ProgressBar easyProgressBar;
    private CountDownTimer easyCountDownTimer;
    private int i = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_questions1);




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
                    openEasyResults1();
                    i++;
                    easyProgressBar.setProgress(100);

                }
            };
            easyCountDownTimer.start();


    }


    public void openEasyResults1() {
        Intent intent = new Intent(this, easy_results1.class);
        startActivity(intent);
    }



}
