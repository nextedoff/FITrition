package com.example.fitrition;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import java.util.Objects;


public class RegisterActivity extends AppCompatActivity {
    EditText emailEditText, passwordEditText, confirmPasswordEditText;
    String email, password, confirmPassword;
    Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        // TODO: Consider below code to remove app name from title bar
        // getSupportActionBar().setDisplayShowTitleEnabled(false);

        // Initialise EditText fields and button
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        confirmPasswordEditText = findViewById(R.id.confirm_password);
        registerButton =  findViewById(R.id.register);

        // Listens for register button click
        registerButton.setOnClickListener(v -> {
            // Get string values from fields
            email = emailEditText.getText().toString();
            password = passwordEditText.getText().toString();
            confirmPassword = confirmPasswordEditText.getText().toString();

            // If all fields are filled out and passwords match, register the user
            if (checkFields(emailEditText, passwordEditText, confirmPasswordEditText)) {
                register();
            }
        });
    }

    private boolean checkFields(EditText email, EditText password, EditText confirmPassword) {
        // TODO: Make field checks more efficient
        if (TextUtils.isEmpty(email.getText().toString())) {
            emailEditText.setError("Field empty");
            emailEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(password.getText().toString())) {
            passwordEditText.setError("Field empty");
            passwordEditText.requestFocus();
            return false;
        }

        if (TextUtils.isEmpty(confirmPassword.getText().toString())) {
            confirmPasswordEditText.setError("Field empty");
            confirmPasswordEditText.requestFocus();
            return false;
        } else if (!TextUtils.equals(password.getText().toString(), confirmPassword.getText().toString())) {
            confirmPasswordEditText.setError("Passwords don't match");
            confirmPasswordEditText.requestFocus();
            return false;
        }
        return true;
    }

    private void register() {
        //TODO: Register functionality, import code from another class?

        // TODO: Launch home page after registration or redirect to login page
        // Intent intent = new Intent(this, HomeActivity.class);
        // intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // startActivity(intent);
    }
}