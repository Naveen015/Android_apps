package com.example.vidhya.musicplayer;

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

        TextView english = (TextView) findViewById(R.id.english);
        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent englishIntent = new Intent(MainActivity.this, EnglishActivity.class);
                startActivity(englishIntent);
            }
        });

        TextView hindi = (TextView) findViewById(R.id.hindi);
        hindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hindiIntent = new Intent(MainActivity.this, HindiActivity.class);
                startActivity(hindiIntent);
            }
        });

        TextView tamil = (TextView) findViewById(R.id.tamil);
        tamil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tamilIntent = new Intent(MainActivity.this, TamilActivity.class);
                startActivity(tamilIntent);
            }
        });
    }

}