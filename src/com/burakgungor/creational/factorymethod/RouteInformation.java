package com.burakgungor.creational.factorymethod;

public class RouteInformation {
    private String type;
    private String manufacturer;
    private String supplier;
    private String distributor;
    private String deliveryPlan;

    public RouteInformation(String type, String manufacturer, String supplier, String distributor, String deliveryPlan) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.supplier = supplier;
        this.distributor = distributor;
        this.deliveryPlan = deliveryPlan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getDeliveryPlan() {
        return deliveryPlan;
    }

    public void setDeliveryPlan(String deliveryPlan) {
        this.deliveryPlan = deliveryPlan;
    }

    @Override
    public String toString() {
        return "RouteInformation{" +
                "type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", supplier='" + supplier + '\'' +
                ", distributor='" + distributor + '\'' +
                ", deliveryPlan='" + deliveryPlan + '\'' +
                '}';
    }
}
