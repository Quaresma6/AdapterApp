package com.example.adaptersapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Adapter View
        listView = findViewById(R.id.listView);

        //Data source
        String[] countries = {"USA", "Germany", "Saudi Arabia", "France"};

        //Adapter act as a bridge between the data source and the Adapter View
        MyCustomAdapter adapter = new MyCustomAdapter(this, countries);

        //Link ListView with the Adapter
        listView.setAdapter(adapter);
    }
}