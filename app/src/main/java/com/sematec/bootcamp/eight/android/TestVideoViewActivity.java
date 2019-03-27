package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TestVideoViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_video_view);


        String url = "https://hw14.cdn.asset.aparat.com/aparat-video/b959429ac071e76765b2d87bbd0892bc14192091-144p__71602.mp4";

        VideoView vv = findViewById(R.id.vv);
        vv.setMediaController(new MediaController(TestVideoViewActivity.this));
        vv.setVideoURI(Uri.parse(url));
        vv.start();


    }
}
