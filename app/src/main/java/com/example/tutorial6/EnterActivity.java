package com.example.tutorial6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        Handler handler =  new Handler();
        Runnable runnable;
        handler.postDelayed(runnable = new Runnable() {
            @Override
            public void run() {
                startActivity( new Intent(EnterActivity.this,EnterPage.class));
                finish();
                 }
        }, 2000);
    }
}