package com.coswit.dagger2example.inject;

import com.coswit.dagger2example.engine.DieselEngine;
import com.coswit.dagger2example.engine.Engine;

import dagger.Module;
import dagger.Provides;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Module
public  class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DieselEngine(horsePower);
    }
}
