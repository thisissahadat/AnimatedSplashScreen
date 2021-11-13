package com.example.lotieanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    TextView HamBird;
    LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        HamBird=findViewById(R.id.HamBird);
        lottie = findViewById(R.id.lotie);



        HamBird.animate().translationY(-1200).setDuration(2000).setStartDelay(0);
        lottie.animate().setDuration(2000).setStartDelay(2900);




        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        },5000);
    }
}