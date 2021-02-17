package com.au.progressbar_intent;

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

        progressBar = findViewById(R.id.progressBar);
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
                        Intent i1 = new Intent(getApplicationContext(),Main2Activity.class);
                        startActivity(i1);
                    }
                }
            }
        }).start();


    }
}
