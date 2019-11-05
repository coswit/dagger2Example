package com.coswit.dagger2example.engine;

import android.util.Log;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;

    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
