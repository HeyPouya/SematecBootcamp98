package com.sematec.bootcamp.eight.android;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);


        Button btnOk = findViewById(R.id.btnOk);
        final EditText edtName = findViewById(R.id.edtName);
        Button btnPage = findViewById(R.id.btnPage);
        Button btnResult = findViewById(R.id.btnResult);

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edtName.getText().toString();
                Log.d("buttonClicked", s);
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_LONG).show();
            }
        });


        btnPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edtName.getText().toString();
                Intent i = new Intent(MainActivity.this, TestActivity.class);
                i.putExtra("name", s);
                startActivity(i);

            }
        });


        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondTestActivity.class);
                startActivityForResult(intent, 1398);
            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1398) {
            if (resultCode == Activity.RESULT_OK) {
                String s = data.getStringExtra("name");
                Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
            }
        }
    }
}