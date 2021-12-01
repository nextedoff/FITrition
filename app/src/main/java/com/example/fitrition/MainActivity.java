package com.example.fitrition;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    Button loginButton, registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Hide the top action bar on splash screen
        Objects.requireNonNull(getSupportActionBar()).hide();

        // Initialise splash screen buttons
        loginButton = findViewById(R.id.main_login_button);
        registerButton = findViewById(R.id.main_register_button);

        // Listens for login button click
        loginButton.setOnClickListener(v -> {
            //TODO: Add login intent
        });

        // Listens for register button click
        registerButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }
}