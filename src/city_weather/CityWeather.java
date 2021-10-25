package city_weather;

import com.google.gson.annotations.SerializedName;

public class CityWeather {
    @SerializedName("name")
    private String city;

    @SerializedName("weather")
    private GeneralWeather[] general_weather;

    @SerializedName("main")
    private Temperature temp;

    private Wind wind;

    // Constructeur
    public CityWeather(GeneralWeather[] general_weather, Temperature temp, Wind wind, String city) {
        this.general_weather = general_weather;
        this.temp = temp;
        this.wind = wind;
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
                .append("\tTemperature felt : ").append(temp.getFeel()).append("°C\n")
                .append("\tMinimum temperature : ").append(temp.getMin()).append("°C\n")
                .append("\tMaximum temperature : ").append(temp.getMax()).append("°C\n")
                .append("\tPressure : ").append(temp.getPressure()).append(" Pa\n")
                .append("\tHumidity : ").append(temp.getHumidity()).append("%\n\n")
                .append("\tWind speed : ").append(wind.getSpeed()).append(" m/s\n")
                .append("\tWind deg : ").append(wind.getDirection()).append(" degrees\n")
                .append("\tWind gust : ").append(wind.getGust()).append(" m/s\n\n")
                .toString();
    }
}
