package com.example.photofraameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class imageActivity3 extends AppCompatActivity {

    ImageButton prev3, next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image3);
        prev3 = findViewById(R.id.prevButton3);
        next3 = findViewById(R.id.nextButton3);

    }
    public void prev3(View v){
        Intent iii = new Intent(this, imageActivity2.class);
        startActivity(iii);
    }
    public void next3(View v){
        Intent iii = new Intent(this, imageActivity4.class);
        startActivity(iii);
    }
}