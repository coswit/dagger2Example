package com.coswit.dagger2example.engine;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {

    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
