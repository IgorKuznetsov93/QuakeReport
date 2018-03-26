package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by Igor Kuznetsov on 24.03.2018.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {

    private static final String LOG_TAG = EarthquakeLoader.class.getName();
    private String mUrl;

    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    public List<Earthquake> loadInBackground() {

        if (mUrl == null) {
            return null;
        }

        List<Earthquake> earthquakes = Utils.fetchEarthquakeData(mUrl);

        return earthquakes;
    }

    @Override
    protected void onStartLoading() {

        forceLoad();
    }
}
