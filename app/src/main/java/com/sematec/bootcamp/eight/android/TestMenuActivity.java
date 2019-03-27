package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class TestMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_menu);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Added by code");
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.test_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.first_item:
                Toast.makeText(this, "First Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.second_item:
                Toast.makeText(this, "Second Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.third_item:
                Toast.makeText(this, "Third Item Selected", Toast.LENGTH_SHORT).show();
                break;
            case 1:
                Toast.makeText(this, "Added by code Selected", Toast.LENGTH_SHORT).show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
