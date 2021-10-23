package main;

import city_weather.CityWeather;
import weather_parsing.WeatherFetcher;

public class Main {

    public static void main(String[] args) throws Exception {

        if (args.length != 1) { // If there is too much or not enough arguments passed
            System.err.println("Usage : /usr/lib/jvm/java-11-openjdk-amd64/bin/java -Dfile.encoding=UTF-8 -classpath /mnt/c/Users/axrem/Documents/ZZ3/Java/TP4/out/production/TP4:/mnt/c/Users/axrem/Documents/ZZ3/Java/TP4/lib/gson-2.8.8.jar main.Main city_name");
            throw new IllegalArgumentException();
        }

        try {
            WeatherFetcher wf = new WeatherFetcher();
            CityWeather weather = wf.getWeatherIn(args[0]);
            System.out.println(weather);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
