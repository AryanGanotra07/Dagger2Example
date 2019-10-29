package com.aryanganotra.daggerexample.Dagger;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine provideEngine(DieselEngine engine);
}
