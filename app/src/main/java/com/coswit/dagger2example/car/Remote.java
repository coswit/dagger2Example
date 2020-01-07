package com.coswit.dagger2example.car;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class Remote {
    private static final String TAG = "Car";

    @Inject
    public Remote() {

    }

    public void setListener(Car car) {
        Log.d(TAG, "Remote connected");
    }
}
