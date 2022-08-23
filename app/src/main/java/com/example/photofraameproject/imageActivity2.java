package com.example.photofraameproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class imageActivity2 extends AppCompatActivity {

    ImageButton prev2, next2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image2);
        prev2 = findViewById(R.id.prevButton2);
        next2 = findViewById(R.id.nextButton2);
    }
    public void prevv(View v){
        Intent ii = new Intent(this,MainActivity.class);
        startActivity(ii);
    }
    public void nextt(View v){
        Intent ii = new Intent(this, imageActivity3.class);
        startActivity(ii);
    }
}