package main;

import weather_parsing.WeatherFetcher;

public class Main {

    public static void main(String[] args) throws Exception {
        WeatherFetcher wf = new WeatherFetcher();
        wf.getWeatherIn();
    }
}
