package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        // Get username from intent extras
        String username = getIntent().getStringExtra("username");

        // Display welcome message
        TextView welcomeTextView = findViewById(R.id.welcome_text_view);
        welcomeTextView.setText("Hi " + username + ", welcome to the app!");
    }
}
