package com.example.mycalculater;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText numberInput = findViewById(R.id.number_input);
    private TextView resultView;


    public MainActivity() {
    }


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = findViewById(R.id.result);
        Button button = findViewById(R.id.button);

        // Add a click listener to the clear button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberInput.setText("");
                resultView.setText("0");
            }
        });
    }
