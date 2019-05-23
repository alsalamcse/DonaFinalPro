package com.daoud.dona.fitnessloseweight;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainPage extends AppCompatActivity {
    private Button btnTodayTrainnings, btnWeightUpdate;
    private EditText etAdress;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        btnTodayTrainnings = (Button) findViewById(R.id.btnTodayTrainnings);
        btnWeightUpdate = (Button) findViewById(R.id.btnWeightUpdate);
        etAdress = (EditText) findViewById(R.id.etAdress);
    }


        public void onClick (View v)
        {
            if (v == btnTodayTrainnings) {
                Intent intent = new Intent(MainPage.this, DailyExersices.class);
                startActivity(intent);
                finish();
            }
        }



        public void onClick3 (View v)
        {
            if (v == btnWeightUpdate) {
                Intent intent = new Intent(MainPage.this, WiehghtUpdate.class);
                startActivity(intent);
                finish();
            }
        }
    }



