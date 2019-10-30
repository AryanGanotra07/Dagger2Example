package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Car;
import com.aryanganotra.daggerexample.MainActivity;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity
@Subcomponent(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity activity);

    @Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("engine")int engineCapacity);
//
//        Builder appComponent(AppComponent appComponent);

      ActivityComponent build();
    }
}
