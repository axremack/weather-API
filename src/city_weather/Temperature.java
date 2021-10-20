package city_weather;

public class Temperature {
    // Paramètres obligatoires
    private double temp;
    private double feel;
    private double max;
    private double min;
    private double pressure;    //(maybe int ?)
    private double humidity;    //(maybe int ?)

    // Constructeur
    public Temperature(double temp, double feel, double max, double min, double pressure, double humidity) {
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

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
}
