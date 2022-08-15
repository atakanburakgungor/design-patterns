package com.burakgungor.behavioral.observer;

@FunctionalInterface
public interface Observer {
    void update(float temperature, float humidity,float pressure);
}
