/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc;

/**
 *
 * @author Niki
 */
import java.util.ArrayList;
import java.util.Random;

public class WeatherForecaster {
    private Random random;

    public WeatherForecaster() {
        this.random = new Random();
    }

    public String forecastWeather() {
        double probability = this.random.nextDouble();

        if (probability <= 0.1) {
            return "Sleet";
        } else if (probability <= 0.4) { // 0.1 + 0.3
            return "Snow";
        } else { // the rest, 1.0 - 0.4 = 0.6
            return "Sunny";
        }
    }

    public int forecastTemperature() {
        return (int) ( 4 * this.random.nextGaussian() - 3 );
    }
}