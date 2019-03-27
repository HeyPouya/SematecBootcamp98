package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class TestThreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_thread);

        Log.d("ThreadName",Thread.currentThread().getName());


        new Thread(new Runnable() {
            @Override
            public void run() {
                Log.d("ThreadName",Thread.currentThread().getName());
            }
        }).start();

    }
}
