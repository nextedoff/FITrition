package com.example.fitrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText, confirmPasswordEditText;
    String email, password, confirmPassword;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Initialise EditText fields and button
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirm_password);
        registerButton =  findViewById(R.id.register);

        // Listens for register button click
        registerButton.setOnClickListener(v -> {
            email = emailEditText.getText().toString();
            password = passwordEditText.getText().toString();
            confirmPassword = confirmPasswordEditText.getText().toString();

            // If all fields are filled out and passwords match, register the user
            if (TextUtils.isEmpty(email) || TextUtils.isEmpty(password)
            || TextUtils.isEmpty(confirmPassword)) {
                Toast.makeText(RegisterActivity.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            } else if (!TextUtils.equals(password, confirmPassword)) {
                Toast.makeText(RegisterActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
            } else {
                register();
            }
        });
    }

    public void register() {
        //TODO: Register functionality
    }
}