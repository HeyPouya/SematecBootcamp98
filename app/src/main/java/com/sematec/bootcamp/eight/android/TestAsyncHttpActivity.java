package com.sematec.bootcamp.eight.android;

import androidx.appcompat.app.AppCompatActivity;
import cz.msebera.android.httpclient.Header;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.sematec.bootcamp.eight.android.pray.PrayTimesClass;

import org.json.JSONObject;

public class TestAsyncHttpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_async_http);

        String url = "http://api.aladhan.com/v1/timingsByCity?city=Tehran&country=Iran&method=8";

        AsyncHttpClient client = new AsyncHttpClient();

        client.get(url, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);

                Gson gson = new Gson();
                PrayTimesClass times = gson.fromJson(response.toString(),PrayTimesClass.class);

                String maqrib = times.getData().getTimings().getMaghrib();
                Log.d("Maqrib",maqrib);

            }


            @Override
            public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
                super.onFailure(statusCode, headers, throwable, errorResponse);
            }
        });
    }
}
