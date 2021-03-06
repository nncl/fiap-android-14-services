package com.cauealmeida.androidservice;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.cauealmeida.androidservice.broadcastservice.AlarmReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View v) {
        EditText editText = (EditText) findViewById(R.id.edtTime);
        String time = editText.getText().toString();
        if (time != null && !time.isEmpty()) {
            int i = Integer.parseInt(time);

            Intent intent = new Intent(this, AlarmReceiver.class);

            PendingIntent pendingIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 0, intent, 0);

            AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);
            alarmManager.set(AlarmManager.RTC_WAKEUP,
                    System.currentTimeMillis() + (i * 1000),
                    pendingIntent);

            Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Bro, add a time dough", Toast.LENGTH_SHORT).show();
        }
    }
}
