package com.burakgungor.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        String type = "Sea";
        Logistics logistics = new LogisticFactory().getInstance(type);
        RouteInformation transport = logistics.createTransport();
        System.out.println(transport.toString());
    }
}
