package com.burakgungor.creational.factorymethod;

import java.util.Objects;

public class LogisticFactory {
    public static final String TRANSPORT_TYPE_ROAD = "Road";
    public static final String TRANSPORT_TYPE_SEA = "Sea";

    Logistics logistics;

    public Logistics getInstance(String type) {
        if (Objects.equals(type, TRANSPORT_TYPE_SEA)) logistics = new SeaLogistics();
        else if (Objects.equals(type, TRANSPORT_TYPE_ROAD)) logistics = new RoadLogistics();
        return logistics;
    }
}
