package com.example.fitrition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogInActivity extends AppCompatActivity {

    EditText usernameEditText, passwordEditText;
    String username, password;
    Button loginButton, forgotPswButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        androidx.appcompat.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_background));
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Initialise EditText fields and buttons
        usernameEditText = findViewById(R.id.username_input_field);
        passwordEditText = findViewById(R.id.password_input_field);
        loginButton = findViewById(R.id.logIn_button);
        forgotPswButton = findViewById(R.id.forgot_password_button);

        // Listens for login button click
        loginButton.setOnClickListener(v -> {
            username = usernameEditText.getText().toString();
            password = passwordEditText.getText().toString();

            // If all fields are filled out log in the user
            if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)) {
                Toast.makeText(LogInActivity.this, "Please fill out all fields", Toast.LENGTH_SHORT).show();
            } else {
                login();
            }
        });

        // Listens for forgot password button click
        forgotPswButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // temporary message
                Toast.makeText(LogInActivity.this, "Forgot your password?", Toast.LENGTH_SHORT).show();
                forgot_password();
            }
        });
    }

    public void login(){
        //TODO: login functionality
    }

    public void forgot_password(){
        //TODO: forgotten password functionality
    }
}