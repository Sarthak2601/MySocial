package com.example.mysocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.Timer;

public class splashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {

               startActivity(new Intent(splashScreen.this, LoginActivity.class));

           }
       },2000);

    }
}
