package com.coswit.dagger2example;

import android.app.Application;

import com.coswit.dagger2example.component.AppComponent;
import com.coswit.dagger2example.component.DaggerAppComponent;

/**
 * @author Created by zhengjing on 2020-01-07.
 */
public class App extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
