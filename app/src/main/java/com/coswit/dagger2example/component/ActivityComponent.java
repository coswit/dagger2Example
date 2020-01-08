package com.coswit.dagger2example.component;

import com.coswit.dagger2example.MainActivity;
import com.coswit.dagger2example.car.Car;
import com.coswit.dagger2example.module.DieselEngineModule;
import com.coswit.dagger2example.module.WheelsModule;
import com.coswit.dagger2example.scoped.PerActivity;

import dagger.Subcomponent;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
//@Singleton
@PerActivity
@Subcomponent( modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity activity);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@Named("horse power") int horsePower);
//
//        @BindsInstance
//        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
//
//        Builder appComponet(AppComponent appComponent);
//
//        ActivityComponent build();
//    }
}
