package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TestPrefrenceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_prefrence);
        Button btnSave = findViewById(R.id.btnSave);
        Button btnShow = findViewById(R.id.btnShow);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceManager.getDefaultSharedPreferences(TestPrefrenceActivity.this).edit().putString("name", "Pouya").apply();
            }
        });


        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = PreferenceManager.getDefaultSharedPreferences(TestPrefrenceActivity.this).getString("name", "Qoli");

                Toast.makeText(TestPrefrenceActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
