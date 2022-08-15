package com.burakgungor.behavioral.observer;

public class CurrentConditionsDisplay implements Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.subscribe(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    public void display() {
        System.out.println("CurrentConditions : {" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressure=" + pressure +
                '}');
    }
}
