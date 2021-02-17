package com.au.datepickerandtimepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

EditText datepicker,timepicker;
Button date;
Calendar c = Calendar.getInstance();
int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH);
    int day = c.get(Calendar.DAY_OF_MONTH);
    int hour = c.get(Calendar.HOUR);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker = findViewById(R.id.datepicker);
        timepicker = findViewById(R.id.timepicker);
        month++;
        datepicker.setText(day+"/"+month+"/"+year);
        if(hour==0){
            hour=12;
            timepicker.setText(hour+" : "+minute+" : "+second);
        }
        else
        {
            timepicker.setText(hour+" : "+minute+" : "+second);
        }

       datepicker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dp = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    i1++;
                        datepicker.setText(i2+"/"+i1+"/"+i);
                    }
                },2021,01,03);
                dp.show();
            }
        });
       timepicker.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               TimePickerDialog tp = new TimePickerDialog(MainActivity.this, new TimePickerDialog.OnTimeSetListener() {
                   @Override
                   public void onTimeSet(TimePicker timePicker, int i, int i1) {
                            timepicker.setText(i+" : "+i1);
                   }
               },12,03,true);
               tp.show();
           }
       });
    }
}
