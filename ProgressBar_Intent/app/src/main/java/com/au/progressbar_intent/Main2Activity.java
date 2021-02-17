package com.au.progressbar_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.textView2);
        textView.setText("Hello Punit..... Welcome to the new Activity");
        Toast.makeText(getApplicationContext(),textView.getText(),Toast.LENGTH_LONG).show();
    }
}
