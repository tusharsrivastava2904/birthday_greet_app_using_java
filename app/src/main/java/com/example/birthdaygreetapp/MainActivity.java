package com.example.birthdaygreetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    public static final String EXTRA_NAME = " com.example.birthdaygreetapp.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Greet(View view) {
        name = findViewById(R.id.editTextTextPersonName);
        String nameText = name.getText().toString();

        Toast.makeText(this, "Processing your request...", Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra(EXTRA_NAME,nameText);


        startActivity(intent);
    }
}