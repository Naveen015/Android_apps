package com.example.vidhya.tourguider;

public class Location {

    private int mName=0;
    private int mDesc=0;
    private int mImgResId=0;


    public Location(int name, int desc) {
        mName=name;
        mDesc=desc;
    }
    public Location(int name, int desc, int imgResId) {
        mName=name;
        mDesc=desc;
        mImgResId=imgResId;
    }

    public int getLocationName() {
        return mName;
    }

    public int getLocationDesc() { return mDesc; }

    public int getLocationImg() { return mImgResId;  }
}
