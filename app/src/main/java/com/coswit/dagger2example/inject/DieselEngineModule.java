package com.coswit.dagger2example.inject;

import com.coswit.dagger2example.engine.DieselEngine;
import com.coswit.dagger2example.engine.Engine;

import dagger.Binds;
import dagger.Module;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
