package com.burakgungor.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class ForecastDisplay implements Observer {
    private List<Float> temperatures;
    private List<Float> humidities;
    private List<Float> pressures;

    public ForecastDisplay(Subject weatherData) {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();
        pressures = new ArrayList<>();
        weatherData.subscribe(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        this.humidities.add(humidity);
        this.pressures.add(pressure);
        display();
    }

    public void display() {
        System.out.println("Forecast : {" +
                "temperatures=" + temperatures +
                ", humidities=" + humidities +
                ", pressures=" + pressures +
                '}');
    }
}
