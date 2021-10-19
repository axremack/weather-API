package city_weather;

public class CityWeather {
    // Paramètres obligatoires
    private GeneralWeather general_weather;
    private Temperature temp;
    private Wind wind;
    private Rain rain;
    private Snow snow;
    private double cloudiness;

    // Constructeur
    public CityWeather(GeneralWeather general_weather, Temperature temp, Wind wind, Rain rain, Snow snow, double cloudiness) {
        this.general_weather = general_weather;
        this.temp = temp;
        this.wind = wind;
        this.rain = rain;
        this.snow = snow;
        this.cloudiness = cloudiness;
    }

    // Getters et setters
    public GeneralWeather getGeneral_weather() {
        return general_weather;
    }

    public void setGeneral_weather(GeneralWeather general_weather) {
        this.general_weather = general_weather;
    }

    public Temperature getTemp() {
        return temp;
    }

    public void setTemp(Temperature temp) {
        this.temp = temp;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Rain getRain() {
        return rain;
    }

    public void setRain(Rain rain) {
        this.rain = rain;
    }

    public Snow getSnow() {
        return snow;
    }

    public void setSnow(Snow snow) {
        this.snow = snow;
    }

    public double getCloudiness() {
        return cloudiness;
    }

    public void setCloudiness(double cloudiness) {
        this.cloudiness = cloudiness;
    }




}
