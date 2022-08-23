package com.example.photofraameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class imageActivity4 extends AppCompatActivity {

    ImageButton prev4, next4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image4);
        prev4 = findViewById(R.id.prevButton4);
        next4 = findViewById(R.id.nextButton4);
    }
    public void prev4(View v){
        Intent iiii = new Intent(this, imageActivity3.class);
        startActivity(iiii);
    }
    public void next4(View v){
        Intent iiii = new Intent(this, MainActivity.class);
        startActivity(iiii);
    }
}