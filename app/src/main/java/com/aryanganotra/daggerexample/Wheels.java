package com.aryanganotra.daggerexample;

import javax.inject.Inject;

public class Wheels {

    private Rims rims;
    private Tyres tyres;


    Wheels(Rims rims, Tyres tyres){
        this.rims = rims;
        this.tyres = tyres;
    }
}
