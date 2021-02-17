package com.au.combo_progressbar_actv_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {


    ProgressBar progressBar;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.progressBar2);
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (i<=100){
                    i++;
                    progressBar.setProgress(i);
                    try {
                        Thread.sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (i==100)
                    {
                        Intent i2 = new Intent(getApplicationContext(),ACTV_Spinner.class);
                        startActivity(i2);
                    }
                }
            }
        }).start();


    }
}
