package com.adorable.adespl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.google.android.material.progressindicator.LinearProgressIndicator;

public class MainActivity extends AppCompatActivity {
    LinearProgressIndicator progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
        setContentView(R.layout.activity_main);

        progressBar = findViewById(R.id.p1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (restorePrefData()) {
                    Intent mainActivity = new Intent(getApplicationContext(), Main_Dashboard.class);
                    startActivity(mainActivity);
                    finish();

                }
                else {
                    Intent mainActivity = new Intent(getApplicationContext(), OnBoarding_Screen.class);
                    startActivity(mainActivity);
                    finish();
                }

            }
        }, 1500);
    }

    private boolean restorePrefData() {


        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs", MODE_PRIVATE);
        Boolean isIntroActivityOpnendBefore = pref.getBoolean("isIntroOpnend", false);
        return isIntroActivityOpnendBefore;


    }
}