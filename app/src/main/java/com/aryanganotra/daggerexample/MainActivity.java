package com.aryanganotra.daggerexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.aryanganotra.daggerexample.Car.Car;
import com.aryanganotra.daggerexample.Dagger.ActivityComponent;
import com.aryanganotra.daggerexample.Dagger.AppComponent;
import com.aryanganotra.daggerexample.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ActivityComponent component = DaggerActivityComponent.builder().appComponent(((ExampleApp)getApplication()).getComponent()).engineCapacity(100).horsePower(100).build();
//        component.getCar().drive();

        ActivityComponent component = ((ExampleApp)getApplication()).getComponent().getActivityComponentFactory()
                .create(100,1500);



    }
}
