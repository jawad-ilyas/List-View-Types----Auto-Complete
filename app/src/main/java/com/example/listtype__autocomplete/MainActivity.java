package com.example.listtype__autocomplete;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // now need to find id
    AutoCompleteTextView acLanguage ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find the id for work
        acLanguage = findViewById(R.id.acLanguage);

        // create a array list for the populate data

        ArrayList<String>  arrLanguage = new ArrayList<>();
        arrLanguage.add("c++");
        arrLanguage.add("c");
        arrLanguage.add("c#");
        arrLanguage.add("java");
        arrLanguage.add("reach");
        arrLanguage.add("mern");

        // create a adapter for connection
        ArrayAdapter<String> languageAdapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_dropdown_item , arrLanguage);

        // now find the conneciton
        acLanguage.setAdapter(languageAdapter);

        // this funciton is used for show suggestion to user katna words ka bad
        acLanguage.setThreshold(1);


    }
}