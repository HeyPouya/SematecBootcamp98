package com.sematec.bootcamp.eight.android;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {

    ArrayList<String> myList;

    TestAdapter(ArrayList<String> list) {
        myList = list;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyler_item, parent, false);
        TestViewHolder viewHolder = new TestViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {

        holder.txtName.setText(myList.get(position));
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }

    class TestViewHolder extends RecyclerView.ViewHolder {

        TextView txtName;


        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
