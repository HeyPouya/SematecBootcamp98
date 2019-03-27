package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);

        AlertDialog dialog = new AlertDialog.Builder(AlertDialogActivity.this).create();
        dialog.setTitle("Attention!");
        dialog.setMessage("There is problem here !");
        dialog.setButton(AlertDialog.BUTTON_POSITIVE, "Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Intent intent = new Intent(AlertDialogActivity.this, TestDialogActivity.class);
                startActivity(intent);
                dialog.dismiss();
            }
        });


        dialog.setButton(AlertDialog.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(AlertDialogActivity.this, "Canceled!!!", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });


        dialog.show();


    }
}
