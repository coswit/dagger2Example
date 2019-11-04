package com.coswit.dagger2example.inject;

import com.coswit.dagger2example.Rims;
import com.coswit.dagger2example.Tires;
import com.coswit.dagger2example.Wheels;

import dagger.Module;
import dagger.Provides;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Module
public class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
