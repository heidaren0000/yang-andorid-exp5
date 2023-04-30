package com.example.yang_exp5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    private TextView usernameDisplay;
    private TextView passwordDisplay;

    private static String EXTRA_USERNAME_KEY = "org.yangkaiqi.exp5.secondActivity.usernameExtra";
    private static String EXTRA_PASSWORD_KEY = "org.yangkaiqi.exp5.secondActivity.passwordExtra";
    public static Intent newIntent(Context pacakgeContext, String username, String password) {
        Intent newIntent = new Intent(pacakgeContext, SecondActivity.class);
        newIntent.putExtra(EXTRA_USERNAME_KEY, username);
        newIntent.putExtra(EXTRA_PASSWORD_KEY, password);
        return newIntent;
    }
    @Override
    protected void onCreate(Bundle savedInstanceStates){
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.activity_second);
        usernameDisplay = findViewById(R.id.usernameDisplay);
        passwordDisplay = findViewById(R.id.passwordDisplay);
        usernameDisplay.setText(getIntent().getStringExtra(EXTRA_USERNAME_KEY));
        passwordDisplay.setText(getIntent().getStringExtra(EXTRA_PASSWORD_KEY));
    }
}
