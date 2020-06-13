package com.example.android.quakereport;

public class Quakes {
    private Double mMagnitude;
    private String mLocation;
    private long mMilliseconds;
    private String mUrl;

    public Quakes(Double magnitude, String location, long milliseconds, String url) {
        mMagnitude=magnitude;
        mLocation=location;
        mMilliseconds=milliseconds;
        mUrl=url;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public long getmMilliseconds() {
        return mMilliseconds;
    }

    public String getmUrl() { return mUrl; }
}
