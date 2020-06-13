package com.example.vidhya.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class TamilActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Bhoomi Bhoomi","A.R. Rahman"));
        songs.add(new Song("Neeyum naanum anbe","HipHop Tamizha"));
        songs.add(new Song("Anthathi","Govind Vasantha"));
        songs.add(new Song("Aval-Manithan","Santhosh Narayanan"));
        songs.add(new Song("Neeyum Naanum","Anirudh Ravichander"));
        songs.add(new Song("Visiri","A.R. Rahman"));
        songs.add(new Song("Kadhal cricket","HipHop Tamizha"));
        songs.add(new Song("Orasadha","Vivek Mervin"));

        SongAdapter adapter =new SongAdapter(this, songs,R.color.category_tamil);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}