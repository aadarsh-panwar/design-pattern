package singleton;

import java.security.Signature;

/*
Singleton pattern is used when we want/need only one object of class
e.g. Service, Controller, RestController these classes has only instance in most cases

 */
public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if(singleton == null) {
            singleton = new Singleton();
        }
            return singleton;
    }
}
