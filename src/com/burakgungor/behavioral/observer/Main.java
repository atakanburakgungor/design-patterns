package com.burakgungor.behavioral.observer;

import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        IntStream.range(0, 5).forEach(i -> {
            float temp = randomFloat();
            float humidity = randomFloat();
            float pressure = randomFloat();
            weatherData.measurementsChanged(temp, humidity, pressure);
        });
    }

    private static float randomFloat() {
        Random random = new Random();
        return random.nextFloat();
    }
}
