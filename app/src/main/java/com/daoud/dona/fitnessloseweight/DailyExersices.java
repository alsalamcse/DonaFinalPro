package com.daoud.dona.fitnessloseweight;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DailyExersices extends AppCompatActivity {
    private EditText etAdress2, etExe1, etExe2, etExe3, etExe4, etExe5;
    private Button btnDoneExe;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily_exersices);
        btnDoneExe = (Button) findViewById(R.id.btnDoneExe);
        etAdress2 = (EditText) findViewById(R.id.etAdress2);
        etExe1 = (EditText) findViewById(R.id.etExe1);
        etExe2 = (EditText) findViewById(R.id.etExe2);
        etExe3 = (EditText) findViewById(R.id.etExe3);
        etExe4 = (EditText) findViewById(R.id.etExe4);
        etExe5 = (EditText) findViewById(R.id.etExe5);
        btnDoneExe = (Button) findViewById(R.id.btnDoneExe);
    }

    public void onClick(View v) {
        if (v == btnDoneExe) {
            Intent intent = new Intent(DailyExersices.this, MainPage.class);
            startActivity(intent);
            finish();
        }
    }
}