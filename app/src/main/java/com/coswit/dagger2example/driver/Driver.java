package com.coswit.dagger2example.driver;

/**
 * @author Created by zhengjing on 2020-01-03.
 */
//@Singleton
public class Driver {
//we don't own this class so we can't annotate it with @Inject


//    @Inject
//    public Driver() {
//    }

    String name;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
