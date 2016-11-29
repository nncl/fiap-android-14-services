package com.cauealmeida.androidservice.exercise5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.cauealmeida.androidservice.R;

public class BoundActivity extends AppCompatActivity {
    BoundService mBoundService;
    boolean mServiceBound = false;
    private TextView timestampText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        timestampText = (TextView) findViewById(R.id.txtTime);
    }

    public void print(View v) {
        if (mServiceBound) {
            timestampText.setText(mBoundService.getTimestamp());
        }
    }

    public void stop(View v) {
        if (mServiceBound) {
            unbindService(mServiceConnection);
            mServiceBound = false;
        }

        Intent intent = new Intent(BoundActivity.this, BoundService.class);
        stopService(intent);
    }

    // No onStart dessa activity...
    @Override
    protected void onStart(){
        super.onStart();
        Intent intent = new Intent(this, BoundService.class);
        startService(intent);
        bindService(intent, mServiceConnection, Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onStop(){
        super.onStop();
        if(mServiceBound) {
            unbindService(mServiceConnection);
            mServiceBound = false;
        }
    }

    private ServiceConnection mServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            BoundService.MyBinder myBinder = (BoundService.MyBinder) iBinder;
            mBoundService = myBinder.getService();
            mServiceBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            mServiceBound = false;
        }
    };

}
