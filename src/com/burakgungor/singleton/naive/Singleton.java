package com.burakgungor.singleton.naive;

import java.util.Objects;

public class Singleton {
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
