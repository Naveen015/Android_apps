package com.example.naveen.medtech;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ServerValue;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MainActivity extends AppCompatActivity {

    DatabaseReference databaseTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // createNotificationChannel();
        databaseTime = FirebaseDatabase.getInstance().getReference();

        Button getTime = (Button)findViewById(R.id.Time);
        getTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String key = databaseTime.push().getKey(); // this will create a new unique key

                Date date = new Date();
                String strDateFormat = "hh:mm:ss a dd-MM-yy"; //Date format is Specified
                SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
                databaseTime.child(key).setValue(objSDF.format(date));



                NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(MainActivity.this )
                        .setSmallIcon(R.drawable.ic_launcher_background)
                        .setContentTitle("MedTech")
                        .setContentText("New Time variable is created")
                        .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                        .setAutoCancel(true);
                Intent notificationIntent = new Intent(MainActivity.this,MainActivity.class);
                PendingIntent contentIntent = PendingIntent.getActivity(MainActivity.this,0,notificationIntent,PendingIntent.FLAG_UPDATE_CURRENT);
                mBuilder.setContentIntent(contentIntent);

                NotificationManagerCompat notificationManager = NotificationManagerCompat.from(MainActivity.this);
// notificationId is a unique int for each notification that you must define
                notificationManager.notify(0, mBuilder.build());





                final FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference ref = database.getReference("/medtech-665f3/");

// Attach a listener to read the data at our posts reference
                ref.addChildEventListener(new ChildEventListener() {
                    @Override
                    public void onChildAdded(DataSnapshot dataSnapshot, String s) {


                    }

                    @Override
                    public void onChildChanged(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onChildRemoved(DataSnapshot dataSnapshot) {

                    }

                    @Override
                    public void onChildMoved(DataSnapshot dataSnapshot, String s) {

                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
    }

    private void createNotificationChannel() {
        // Create the NotificationChannel, but only on API 26+ because
        // the NotificationChannel class is new and not in the support library
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = getString(R.string.channel_name);
            String description = getString(R.string.channel_description);
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("Channel", name, importance);
            channel.setDescription(description);
            // Register the channel with the system; you can't change the importance
            // or other notification behaviors after this
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }
}
