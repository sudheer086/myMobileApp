package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.TypeVariable;

public class MainActivity extends AppCompatActivity {

    TextView textView, editText;
    Button btnClickme, btnGotoNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Hooks
        textView = findViewById(R.id.textView);
        btnClickme = findViewById(R.id.btmClickme);

        editText = findViewById(R.id.editText);
        btnGotoNext = findViewById(R.id.btn2Next);

        // On button click
        btnClickme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                textView.setText("Button Clicked");

            }
        });

        btnGotoNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputValue = editText.getText().toString();

                Intent intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra("MyValue", inputValue);
                startActivity(intent);

                editText.setText("Button Clicked");

            }
        });
    }
}
