package com.coswit.dagger2example;

/**
 * @author Created by zhengjing on 2019-11-04.
 */
public class Wheels {
//    @Inject
//    public Wheels() {
//
//    }

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
