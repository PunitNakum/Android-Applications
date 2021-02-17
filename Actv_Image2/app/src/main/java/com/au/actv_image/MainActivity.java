package com.au.actv_image;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ImageView imageView;
    String[] batsman = {"Rohit Sharma" , "Virat Kohli ", "M.S.Dhoni"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView2);
        imageView= findViewById(R.id.imageView);
        final ArrayAdapter msg = new ArrayAdapter(this,android.R.layout.select_dialog_item,batsman);
        autoCompleteTextView.setThreshold(1);
        autoCompleteTextView.setAdapter(msg);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),msg.getItem(i).toString(), Toast.LENGTH_LONG).show();
                String nm = msg.getItem(i).toString();
                if (nm.equals("Rohit Sharma"))
                    imageView.setImageResource(R.drawable.rohit);
                if (nm.equals("Virat Kohli"))
                    imageView.setImageResource(R.drawable.kohli);
                if (nm.equals("M.S.Dhoni"))
                    imageView.setImageResource(R.drawable.dhoni);
            }
        });
    }
}

