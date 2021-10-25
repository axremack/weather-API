package city_weather;

import com.google.gson.annotations.SerializedName;

public class Temperature {
    private double temp;

    @SerializedName("feels_like")
    private double feel;

    @SerializedName("temp_max")
    private double max;

    @SerializedName("temp_min")
    private double min;

    private int pressure;
    private int humidity;

    // Constructeur
    public Temperature(double temp, double feel, double max, double min, int pressure, int humidity) {
        this.temp = temp;
        this.feel = feel;
        this.max = max;
        this.min = min;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    // Getters et setters
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeel() {
        return feel;
    }

    public void setFeel(double feel) {
        this.feel = feel;
    }

    public double getMax() {
        return max;
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
