package com.burakgungor.singleton.thread_safe;

import java.util.Objects;

public class Singleton {
    //  The field must be declared volatile so that double check lock would work correctly.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        // The approach taken here is called double-checked locking (DCL).
        // It exists to prevent race condition between multiple threads that may
        // attempt to get singleton instance at the same time, creating
        // separate instances as a result.

        Singleton result = instance;
        if (Objects.nonNull(result)) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
