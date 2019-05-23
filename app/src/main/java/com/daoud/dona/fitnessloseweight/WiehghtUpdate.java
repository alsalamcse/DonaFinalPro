package com.daoud.dona.fitnessloseweight;

import android.content.Intent;
import android.support.annotation.RequiresPermission;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WiehghtUpdate extends AppCompatActivity {
    private TextView etAdress3, etCurrentWeight, etFirstWeight, etLength, etWeightNeeded, etStartedDate, etDaysLift, etLostenWieght;
    private Button btnSaveUpdated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wiehght_update);
        etCurrentWeight = (TextView) findViewById(R.id.etCurrentWeight);
        etFirstWeight = (TextView) findViewById(R.id.etFirstWeight);
        etAdress3 = (TextView) findViewById(R.id.etAdress3);
        etLength = (TextView) findViewById(R.id.etLength);
        etWeightNeeded = (TextView) findViewById(R.id.etWeightNeeded);
        etStartedDate = (TextView) findViewById(R.id.etStartedDate);
        etDaysLift = (TextView) findViewById(R.id.etDaysLift);
        etLostenWieght = (TextView) findViewById(R.id.etLostenWieght);
        btnSaveUpdated = (Button) findViewById(R.id.btnSaveUpdated);

    }

    public void onClick(View v) {
        if (v == btnSaveUpdated) {
            Intent intent = new Intent(WiehghtUpdate.this, MainPage.class);
            startActivity(intent);
            finish();
        }
    }
}
