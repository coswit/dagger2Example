package com.coswit.dagger2example.module;

import com.coswit.dagger2example.engine.Engine;
import com.coswit.dagger2example.engine.PetrolEngine;

import dagger.Binds;
import dagger.Module;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
