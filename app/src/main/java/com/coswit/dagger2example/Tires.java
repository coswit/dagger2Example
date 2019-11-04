package com.coswit.dagger2example;

import android.util.Log;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class Tires {

    //we don't own this class so we can't annotate it with @Inject

    private static final String TAG = "Car";

    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
