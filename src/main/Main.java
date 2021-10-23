package main;

import city_weather.CityWeather;
import weather_parsing.WeatherFetcher;

public class Main {

    public static void main(String[] args) throws Exception {
        String city = "Clermont-Ferrand";

        WeatherFetcher wf = new WeatherFetcher();
        CityWeather c = wf.getWeatherIn(city);
        c.toString();

    }
}
