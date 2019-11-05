package com.coswit.dagger2example.inject;

import com.coswit.dagger2example.Car;
import com.coswit.dagger2example.MainActivity;

import dagger.Component;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Component(modules = {WheelsModule.class,DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);
}
