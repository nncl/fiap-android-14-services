package com.cauealmeida.androidservice.boundservice.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by RM30917 on 28/11/2016.
 */
public class LoggerService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        Log.i("MessageService", "====Service initiated...====");
    }

    public void onDestroy(){
        Log.i("MessageService", "====Service stopped...====");
    }
}
