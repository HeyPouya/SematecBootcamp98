package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);


        TextView txtName = findViewById(R.id.txtName);


        Intent i = getIntent();
        String name = i.getStringExtra("name");

        txtName.setText(name);
    }
}
