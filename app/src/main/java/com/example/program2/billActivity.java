package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class billActivity extends AppCompatActivity {

    Button back_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        back_button = findViewById(R.id.back_button);
    }
    public void backToMain(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}