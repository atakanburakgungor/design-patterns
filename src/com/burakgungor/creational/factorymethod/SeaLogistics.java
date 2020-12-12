package com.burakgungor.creational.factorymethod;

public class SeaLogistics implements Logistics {

    @Override
    public RouteInformation createTransport() {
        return new RouteInformation("SEA","NESTLE", "COCONUT", "LOGITECH", "DEP-SEA-21");
    }
}
