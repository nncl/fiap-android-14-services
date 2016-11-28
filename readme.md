# Android Services

Android Services.
Check [How Services work](https://developer.android.com/guide/components/processes-and-threads.html).

## Exercise 1 - Broadcast Service

- Add the receiver `<receiver android:name=".alarm.AlarmReceiver" />` into Android Manifest, dough
- Create `raw` directory
- Add mp3 song
- Update `onReceive` method

## Exercise 2 - Bound Service

Check **bound** and **unbound** types.

- Adding service: start and stop service
    - onCreate
    - onDestroy
- Check about **START_STICKY**