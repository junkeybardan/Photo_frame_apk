package com.example.photofraameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton prev1, next1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prev1 = findViewById(R.id.prevButton1);
        next1 = findViewById(R.id.nextButton1);
    }
    public void next(View v){
        Intent i = new Intent(this, imageActivity2.class);
        startActivity(i);
    }
    public void prev ( View v){
        Intent i = new Intent(this, imageActivity4.class);
        startActivity(i);
    }
}

