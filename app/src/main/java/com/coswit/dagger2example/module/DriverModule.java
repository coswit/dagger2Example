package com.coswit.dagger2example.module;

import com.coswit.dagger2example.driver.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Created by zhengjing on 2020-01-07.
 */
@Module
public class DriverModule {


    @Singleton
    @Provides
    Driver providerDriver(){
        return  new Driver();
    }

}
