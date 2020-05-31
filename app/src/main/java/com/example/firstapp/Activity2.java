package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        textView = findViewById(R.id.getValue);

        Intent intent = getIntent();
        String myVal = intent.getStringExtra("MyValue");

        textView.setText(myVal);

    }
}
