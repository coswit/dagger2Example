package com.coswit.dagger2example;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.coswit.dagger2example.car.Car;
import com.coswit.dagger2example.component.CarComponent;
import com.coswit.dagger2example.component.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1,car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create();

//        CarComponent component = DaggerCarComponent.builder()
//                .dieselEngineModule(new DieselEngineModule(200))
//                .build();

        CarComponent component = DaggerCarComponent.builder().horsePower(150)
                .engineCapacity(300)
                .build();
        component.inject(this);

//        Car car = component.getCar();
//        car.drive();

        car1.drive();
        car2.drive();
    }
}
