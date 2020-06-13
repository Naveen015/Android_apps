package com.example.naveen.mechanica;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView events = (TextView)findViewById(R.id.events);
        events.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent eventsIntent = new Intent(MainActivity.this,EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

        TextView workshops = (TextView)findViewById(R.id.workshops);
        workshops.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent workshopsIntent = new Intent(MainActivity.this,WorkshopsActivity.class);
                startActivity(workshopsIntent);
            }
        });
    }
}
