package com.cauealmeida.androidservice.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

import com.cauealmeida.androidservice.R;

/**
 * Created by RM30917 on 28/11/2016.
 */
public class AlarmReceiver extends BroadcastReceiver {
    private MediaPlayer mediaPlayer;

    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context, R.raw.hadouken);
        mediaPlayer.start();
        Toast.makeText(context, "Alarm...", Toast.LENGTH_SHORT).show();
    }
}
