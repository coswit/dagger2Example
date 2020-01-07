package com.coswit.dagger2example.car;

import android.util.Log;

import com.coswit.dagger2example.driver.Driver;
import com.coswit.dagger2example.engine.Engine;

import javax.inject.Inject;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class Car {
    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;
    private Driver driver;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    public void drive() {
        engine.start();
        Log.d(TAG, driver + " drives " + this);
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }
}
