package com.coswit.dagger2example.inject;

import com.coswit.dagger2example.Car;
import com.coswit.dagger2example.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
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
