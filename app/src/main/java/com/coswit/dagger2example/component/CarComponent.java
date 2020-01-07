package com.coswit.dagger2example.component;

import com.coswit.dagger2example.car.Car;
import com.coswit.dagger2example.MainActivity;
import com.coswit.dagger2example.module.PetrolEngineModule;
import com.coswit.dagger2example.module.WheelsModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horse power")int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine capacity")int engineCapacity);

        CarComponent build();
    }
}
