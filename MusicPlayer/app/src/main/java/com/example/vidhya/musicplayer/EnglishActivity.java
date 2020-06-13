package com.example.vidhya.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class EnglishActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Shape of you","Ed Sheeran"));
        songs.add(new Song("Closer","Chainsmokers"));
        songs.add(new Song("Let me love you","DJ Snake"));
        songs.add(new Song("Don't let me down","Chainsmokers"));
        songs.add(new Song("Believer","Imagine Dragons"));
        songs.add(new Song("Havana","Camila Cabello"));
        songs.add(new Song("Faded","Alan Walker"));
        songs.add(new Song("Venom","Eminem"));

        SongAdapter adapter =new SongAdapter(this, songs,R.color.category_english);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
