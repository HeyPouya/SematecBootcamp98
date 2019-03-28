package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class TestRecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_recycler);


        ArrayList<String> list = new ArrayList<>();
        list.add("Pouya Heydari");
        list.add("Babak Irani");
        list.add("Parsa Rasouli");
        list.add("Mehrak Zare");
        list.add("Hamed Askarian");
        list.add("Kimia Mohamad Nezhad");
        list.add("Elmira Mahmoudpour");
        list.add("Saeed Mahmoudi");
        list.add("Amirreza Moraveji");
        list.add("Javad Nasiri");
        list.add("Hessamoddin Karamlu");


        RecyclerView recycler = findViewById(R.id.recycler);
        TestAdapter adapter = new TestAdapter(list);
        recycler.setAdapter(adapter);
        recycler.setLayoutManager(new LinearLayoutManager(TestRecyclerActivity.this, RecyclerView.VERTICAL, false));

//        recycler.setLayoutManager(new GridLayoutManager(TestRecyclerActivity.this, 3, RecyclerView.VERTICAL, false));


    }
}
