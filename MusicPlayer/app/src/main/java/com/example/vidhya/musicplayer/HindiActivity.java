package com.example.vidhya.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Song> songs=new ArrayList<Song>();
        songs.add(new Song("Kaala chasma","Prem Hardeep"));
        songs.add(new Song("CutiePie","Pritam"));
        songs.add(new Song("Mana mast magan","Arijit Singh"));
        songs.add(new Song("Nagada sang dhol","Sanjay Leela Bhansali"));
        songs.add(new Song("Matargashti","A.R. Rahman"));
        songs.add(new Song("Balam Pichkari","Pritam"));
        songs.add(new Song("Tujh mein Rab Dikhtha hai","Salim-Suaiman"));
        songs.add(new Song("Khude Jaane","Vishal & Shekar"));

        SongAdapter adapter =new SongAdapter(this, songs,R.color.category_hindi);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
