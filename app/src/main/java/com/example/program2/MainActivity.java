package com.example.program2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button grade_button;
    Button bill_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grade_button = findViewById(R.id.grade_option);
        bill_button = findViewById(R.id.bill_option);
    }

    public void switchActivityGrades(View view) {
        Intent act_action = new Intent(this, gradeActivity.class);
        startActivity(act_action);
    }
    public void switchActivityBill(View view) {
        Intent act_action = new Intent(this, billActivity.class);
        startActivity(act_action);
    }
}