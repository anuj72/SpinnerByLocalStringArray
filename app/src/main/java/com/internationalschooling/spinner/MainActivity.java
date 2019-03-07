package com.internationalschooling.spinner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    String[] country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner =(Spinner)findViewById(R.id.CountrySpinner);
        country=getResources().getStringArray(R.array.countries_array);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,country);
     spinner.setAdapter(adapter);
     spinner.setBackgroundColor(Color.RED);
    String data= spinner.getSelectedItem().toString();
    Log.v("ssssssss",data);




    }
}
