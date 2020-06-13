package com.example.vidhya.musicplayer;

public class Song {
    private String mSongName;
    private String mArtistName;


    public Song(String songName, String artistName) {
        mSongName = songName;
        mArtistName = artistName;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmArtistName() {
        return mArtistName;
    }
}
