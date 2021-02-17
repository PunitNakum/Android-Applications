package com.au.combo_progressbar_actv_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class ACTV_Spinner extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView;
    ImageView imageView;
    String[] batsman = {"Rohit Sharma" , "Virat Kohli"};

    Spinner spinner;
    ImageView imageView2;
    Integer image[] = {R.drawable.kiwi,R.drawable.apple};
    String[] fruit = {"Kiwi","Apple"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actv__spinner);

        autoCompleteTextView = findViewById(R.id.autoCompleteTextView2);
        imageView= findViewById(R.id.imageView);

        spinner = findViewById(R.id.spinner);
        imageView2 = findViewById(R.id.imageView2);

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

            }
        });




        final ArrayAdapter name = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,fruit);
        spinner.setAdapter(name);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),name.getItem(i).toString(),Toast.LENGTH_LONG).show();
                String nm = name.getItem(i).toString();
//                if (nm.equals("Banana"))
//                    imageView.setImageResource(R.drawable.banana);
//                if (nm.equals("Kiwi"))
//                    imageView.setImageResource(R.drawable.kiwi);
//                if (nm.equals("Orange"))
//                    imageView.setImageResource(R.drawable.orange);
//                if (nm.equals("Apple"))
//                    imageView.setImageResource(R.drawable.apple);
                for (int index =0 ; index<fruit.length;index++)
                    if (fruit[index].equals(name.getItem(i)))
                       imageView2.setImageResource(image[index]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }
}
