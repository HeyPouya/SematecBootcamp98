package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import android.widget.Toast;

public class TestWebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_web_view);

        TextView txtTitle = findViewById(R.id.txtTitle);
        txtTitle.setText("WebView Page");


        Intent intent = new Intent(TestWebViewActivity.this, TestService.class);
        startService(intent);


        WebView web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);

        web.setWebViewClient(new CustomWebClient());
        web.loadUrl("https://google.com");
    }


    class CustomWebClient extends WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
//            Toast.makeText(TestWebViewActivity.this, "Started Loading", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
//            Toast.makeText(TestWebViewActivity.this, "Finished Loading", Toast.LENGTH_SHORT).show();

        }
    }
}
