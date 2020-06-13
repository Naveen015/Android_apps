package com.example.naveen.acciona;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void button(View view){
        Intent intent = new Intent(MainActivity.this,SecondaryActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    //Notification
    public class MyReceiver extends BroadcastReceiver {
        public MyReceiver() {
        }

        @Override
        public void onReceive(Context context, Intent intent) {

            Intent intent1 = new Intent(context, MyNewIntentService.class);
            context.startService(intent1);
        }
    }

    public class MyNewIntentService extends IntentService {
        private static final int NOTIFICATION_ID = 3;

        public MyNewIntentService() {
            super("MyNewIntentService");
        }

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        @Override
        protected void onHandleIntent(Intent intent) {
            Notification.Builder builder = new Notification.Builder(this);
            builder.setContentTitle("My Title");
            builder.setContentText("This is the Body");
            builder.setSmallIcon(R.drawable.ic_launcher_foreground);
            Intent notifyIntent = new Intent(this, MainActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(this, 2, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
            builder.setContentIntent(pendingIntent);
            Notification notificationCompat = builder.build();
            NotificationManagerCompat managerCompat = NotificationManagerCompat.from(this);
            managerCompat.notify(NOTIFICATION_ID, notificationCompat);
        }
    }

    Intent notifyIntent = new Intent(this,MyReceiver.class);
    PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100, notifyIntent, PendingIntent.FLAG_UPDATE_CURRENT);
    AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
    public AlarmManager getAlarmManager() {
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis(),AlarmManager.INTERVAL_DAY*30, pendingIntent);
        return alarmManager;
    }
    AlarmManager am = getAlarmManager();

}
