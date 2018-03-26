package com.example.android.quakereport;


/**
 * Created by Igor Kuznetsov on 11.11.2017.
 */

public class Earthquake {
    private Double mMagnitude;
    private String mCity;
    private long mTimeInMilliseconds;
    private String mURL;

    public String getmURL() {
        return mURL;
    }


    public Earthquake(Double mMagnitude, String mCity, long mTimeInMilliseconds, String mURL) {
        this.mMagnitude = mMagnitude;
        this.mCity = mCity;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
        this.mURL = mURL;
    }

    public Double getmMagnitude() {
        return mMagnitude;
    }


    public String getmCity() {
        return mCity;
    }


    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


}



