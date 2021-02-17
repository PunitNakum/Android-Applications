package com.au.spinner_image_array;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner spinner;
    ImageView imageView;
    Integer image[] = {R.drawable.banana,R.drawable.kiwi,R.drawable.apple,R.drawable.orange};
    String[] fruit = {"Banana","Kiwi","Apple","Orange"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        spinner = findViewById(R.id.spinner);
        imageView = findViewById(R.id.imageView2);

        final ArrayAdapter msg = new ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,fruit);
        spinner.setAdapter(msg);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),msg.getItem(i).toString(),Toast.LENGTH_LONG).show();
                String nm = msg.getItem(i).toString();
//                if (nm.equals("Banana"))
//                    imageView.setImageResource(R.drawable.banana);
//                if (nm.equals("Kiwi"))
//                    imageView.setImageResource(R.drawable.kiwi);
//                if (nm.equals("Orange"))
//                    imageView.setImageResource(R.drawable.orange);
//                if (nm.equals("Apple"))
//                    imageView.setImageResource(R.drawable.apple);
                for (int index =0 ; index<fruit.length;index++)
                    if (fruit[index].equals(msg.getItem(i)))
                        imageView.setImageResource(image[index]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}