package com.coswit.dagger2example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coswit.dagger2example.car.Car;
import com.coswit.dagger2example.component.ActivityComponent;
import com.coswit.dagger2example.module.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityComponent component = DaggerCarComponent.create();

//        ActivityComponent component = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(200))
//                .build();

//        ActivityComponent component = DaggerActivityComponent.builder().horsePower(150)
//                .engineCapacity(300)
//                .appComponet(((App)getApplication()).getAppComponent())
//                .build();
//        component.inject(this);

//        Car car = component.getCar();
//        car.drive();


        App app = (App) getApplication();
        ActivityComponent component = app.getAppComponent().getActivityComponent(new DieselEngineModule(100));
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
