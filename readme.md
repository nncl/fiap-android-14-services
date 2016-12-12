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
- Check about **START_STICKY**: [here bro](http://pt.androids.help/q6283)
- Work by pairs in services: oncreate initiates and onstop stops it

EventBus library - to try it.

**Foreground service**: Actions in notifications with Services

**Intent Service**: dont need to control the requests queues, it does it for us, neither the sync
task, it makes for us.

http://www.thiengo.com.br/

http://www.truiton.com/

http://www.vogella.com/

https://developer.android.com/

http://www.androidhive.info/

http://wordpad.cc/12mob-ref

## Exercise 5

It's **[here](http://www.truiton.com/2014/11/bound-service-example-android/)**.
