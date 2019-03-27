package com.sematec.bootcamp.eight.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadcastReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "You have Activated Airplane Mode!", Toast.LENGTH_LONG).show();


    }
}
