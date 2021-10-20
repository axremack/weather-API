package city_weather;

import com.google.gson.annotations.SerializedName;

public class CityWeather {
    // Paramètres obligatoires
    @SerializedName("name")
    private String city;

    @SerializedName("weather")
    private GeneralWeather general_weather;

    //@SerializedName("main")
    //private Temperature temp;

    //private Wind wind;
    //private Rain rain;
    //private Snow snow;
    //private double cloudiness;


    // Constructeur
    public CityWeather(GeneralWeather general_weather, String city) {
        this.general_weather = general_weather;
        //this.temp = temp;
        //this.wind = wind;
        //this.rain = rain;
        //this.snow = snow;
        //this.cloudiness = cloudiness;
        this.city = city;
    }

    // Getters et setters
    public GeneralWeather getGeneral_weather() {
        return general_weather;
    }

    public void setGeneral_weather(GeneralWeather general_weather) {
        this.general_weather = general_weather;
    }
    /*
    public Temperature getTemp() { return temp; }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Rain getRain() { return rain; }

    public void setRain(Rain rain) { this.rain = rain; }

    public Snow getSnow() { return snow; }

    public void setSnow(Snow snow) { this.snow = snow; }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }
    */
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        StringBuilder summary = new StringBuilder();
        return summary.append("Weather for city : ").append(this.city).append("\n")
                .append("General weather : ").append(general_weather.getType()).append(" -- ").append(general_weather.getDescription()).append("\n")
                //.append("Current temperature : ").append(temp.getTemp()).append("°C\n")
                //.append("Current temperature : ").append(temp.getTemp()).append("°C\n")
                //.append("Temperature felt : ").append(temp.getFeel()).append("°C\n")
                //.append("Minimum temperature : ").append(temp.getMin()).append("°C\n")
                //.append("Maximum temperature : ").append(temp.getMax()).append("°C\n")
                //.append("Pressure : ").append(temp.getPressure()).append("Pa\n")
                //.append("Humidity : ").append(temp.getHumidity()).append("%\n")
                //.append("Wind speed : ").append(wind.getSpeed()).append("m/s\n")
                //.append("Wind deg : ").append(wind.getDirection()).append("degrees\n")
                //.append("Wind gust : ").append(wind.getGust()).append("m/s\n")
                //.append("Rain volume in last hour : ").append(rain.getVolume_1h()).append("mm^3\n")
                //.append("Rain volume in last 3 hours : ").append(rain.getVolume_3h()).append("mm^3\n")
                //.append("Snow volume in last hour : ").append(snow.getVolume_1h()).append("mm^3\n")
                //.append("Snow volume in last 3 hours : ").append(snow.getVolume_3h()).append("mm^3\n")
                .toString();
    }
}
