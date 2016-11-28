package com.cauealmeida.androidservice.boundservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cauealmeida.androidservice.R;
import com.cauealmeida.androidservice.boundservice.services.LoggerService;

public class LoggerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logger);
    }

    public void start(View v) {
        Intent intent = new Intent(this, LoggerService.class);
        startService(intent);
    }

    public void stop(View v) {
        Intent intent = new Intent(this, LoggerService.class);
        stopService(intent);
    }
}
