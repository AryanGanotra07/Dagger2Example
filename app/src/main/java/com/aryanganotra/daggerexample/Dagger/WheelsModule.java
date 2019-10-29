package com.aryanganotra.daggerexample.Dagger;

import com.aryanganotra.daggerexample.Car.Rims;
import com.aryanganotra.daggerexample.Car.Tyres;
import com.aryanganotra.daggerexample.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tyres provideTyres(){
        Tyres tyres = new Tyres();
        tyres.inflate();
        return tyres;
    }

    @Provides
   static Wheels provideWheels(Rims rims, Tyres tyres)
    {
        return new Wheels(rims,tyres);
    }
}
