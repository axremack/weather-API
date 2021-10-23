package city_weather;

import com.google.gson.annotations.SerializedName;

public class CityWeather {
    // Paramètres obligatoires
    @SerializedName("name")
    private String city;

    @SerializedName("weather")
    private GeneralWeather[] general_weather;

    @SerializedName("main")
    private Temperature temp;

    private Wind wind;
    //private Rain rain;
    //private Snow snow;

    //@SerializedName("clouds.all")
    //private int cloudiness;


    // Constructeur
    public CityWeather(GeneralWeather[] general_weather, Temperature temp, Wind wind, String city) {
        this.general_weather = general_weather;
        this.temp = temp;
        this.wind = wind;
        //System.out.println("Truc");
        //System.out.println(rain.getVolume_1h());
        //this.rain = rain == null ? new Rain(0.0,0.0) : rain;
        //this.rain = rain;
        //this.snow = snow;
        //this.cloudiness = cloudiness;
        this.city = city;
    }

    // Getters et setters
    public GeneralWeather[] getGeneral_weather() {
        return general_weather;
    }

    public void setGeneral_weather(GeneralWeather[] general_weather) {
        this.general_weather = general_weather;
    }

    public Temperature getTemp() { return temp; }

    public void setTemp(Temperature temp) { this.temp = temp; }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    /*
    public Rain getRain() { return rain; }

    public void setRain(Rain rain) { this.rain = rain; }


    public Snow getSnow() { return snow; }

    public void setSnow(Snow snow) { this.snow = snow; }


    public int getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(int cloudiness) {
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
                .append("\tGeneral weather : ").append(general_weather[0].getType()).append(" -- ").append(general_weather[0].getDescription()).append("\n\n")
                .append("\tCurrent temperature : ").append(temp.getTemp()).append("°C\n")
                .append("\tCurrent temperature : ").append(temp.getTemp()).append("°C\n")
                .append("\tTemperature felt : ").append(temp.getFeel()).append("°C\n")
                .append("\tMinimum temperature : ").append(temp.getMin()).append("°C\n")
                .append("\tMaximum temperature : ").append(temp.getMax()).append("°C\n")
                .append("\tPressure : ").append(temp.getPressure()).append(" Pa\n")
                .append("\tHumidity : ").append(temp.getHumidity()).append("%\n\n")
                //.append("	Cloudiness : ").append(cloudiness).append("%\n")
                .append("\tWind speed : ").append(wind.getSpeed()).append(" m/s\n")
                .append("\tWind deg : ").append(wind.getDirection()).append(" degrees\n")
                .append("\tWind gust : ").append(wind.getGust()).append(" m/s\n\n")
                //.append("\tRain volume in last hour : ").append(rain.getVolume_1h()).append(" mm\n")
                //.append("\tRain volume in last 3 hours : ").append(rain.getVolume_3h()).append(" mm\n")
                //.append("	Snow volume in last hour : ").append(snow.getVolume_1h()).append(" mm^3\n")
                //.append("	Snow volume in last 3 hours : ").append(snow.getVolume_3h()).append(" mm^3\n")
                .toString();
    }
}
