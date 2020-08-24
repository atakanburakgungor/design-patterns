package com.burakgungor.singleton.naive;

import java.util.Objects;

public class Singleton {
    /**
    • Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
    • Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to
    create an object and saves it in a static field. All following calls to this method return the cached object.
    If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that
    method is called, the same object is always returned.
    */
    public static Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (Objects.isNull(instance)) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
