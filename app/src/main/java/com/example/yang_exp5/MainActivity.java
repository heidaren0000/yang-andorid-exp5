package com.example.yang_exp5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText usernameInput;
    EditText passwordInput;
    Button okayBtn;
    @Override
    protected void onCreate(Bundle savedInstanceStates) {
        super.onCreate(savedInstanceStates);
        setContentView(R.layout.activity_main);
        usernameInput = findViewById(R.id.usernameInput);
        passwordInput = findViewById(R.id.passwordInput);
        okayBtn = findViewById(R.id.buttonConfirm);

        okayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(SecondActivity.newIntent(MainActivity.this, usernameInput.getText().toString(), passwordInput.getText().toString()));
            }
        });
    }

}
