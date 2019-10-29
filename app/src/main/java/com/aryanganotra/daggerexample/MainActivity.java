package com.aryanganotra.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aryanganotra.daggerexample.Car.Car;
import com.aryanganotra.daggerexample.Dagger.CarComponent;
import com.aryanganotra.daggerexample.Dagger.DaggerCarComponent;
import com.aryanganotra.daggerexample.Dagger.PetrolEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder().petrolEngineModule(new PetrolEngineModule(100)).build();
        component.inject(this);

        car.drive();




    }
}
