package com.example.yogesh.movehack;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int SPLASH_TIME_OUT;
        SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent load =new Intent(MainActivity.this,Homepage.class);
                startActivity(load);
                finish();
            }


        }, SPLASH_TIME_OUT);
    }
}
