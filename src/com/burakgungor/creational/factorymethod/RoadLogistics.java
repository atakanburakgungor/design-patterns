package com.burakgungor.creational.factorymethod;

public class RoadLogistics implements Logistics {

    @Override
    public RouteInformation createTransport() {
        return new RouteInformation("ROAD","LAYS", "PRINGLES", "LOGITECH", "DEP-ROAD-12");
    }
}
