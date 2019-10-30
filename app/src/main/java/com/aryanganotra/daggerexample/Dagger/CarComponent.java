package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Car;
import com.aryanganotra.daggerexample.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine")int engineCapacity);

      CarComponent build();
    }
}
