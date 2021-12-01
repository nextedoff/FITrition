package com.example.fitrition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_background));
        getSupportActionBar().setDisplayShowTitleEnabled(false);
    }
}