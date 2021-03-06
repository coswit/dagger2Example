package com.coswit.dagger2example.component;

import com.coswit.dagger2example.module.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Created by zhengjing on 2020-01-07.
 */
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

//    Driver getDriver();

//    ActivityComponent getActivityComponent(DieselEngineModule module);
//    ActivityComponent.Builder getActivityComponentBuilder();

    ActivityComponent.Factory getActivityComponentFactory();

    @Component.Factory
    interface Factory{
        AppComponent create(DriverModule module);
    }
}
