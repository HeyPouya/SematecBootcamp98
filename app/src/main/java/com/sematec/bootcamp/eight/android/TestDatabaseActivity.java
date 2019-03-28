package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class TestDatabaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_database);

        TestSqlHelper helper = new TestSqlHelper(TestDatabaseActivity.this, "sematec", null, 1);


        helper.insertData("Pouya", "Heydari", 80);
        helper.insertData("Ali", "Heydari", 80);
        helper.insertData("Qoli", "Heydari", 80);
        helper.insertData("Mamal", "Heydari", 80);
        helper.insertData("Sajad", "Heydari", 80);


        String names = helper.getStudentsNames();

        Toast.makeText(this, names, Toast.LENGTH_LONG).show();

    }
}
