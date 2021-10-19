package city_weather;

public class Temperature {
    // Paramètres obligatoires
    private double temp;
    private double temp_feel;
    private double temp_max;
    private double temp_min;
    private double pressure;    //(maybe int ?)
    private double humidity;    //(maybe int ?)

    // Constructeur
    public Temperature(double temp, double temp_feel, double temp_max, double temp_min, double pressure, double humidity) {
        this.temp = temp;
        this.temp_feel = temp_feel;
        this.temp_max = temp_max;
        this.temp_min = temp_min;
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

    public double getTemp_feel() {
        return temp_feel;
    }

    public void setTemp_feel(double temp_feel) {
        this.temp_feel = temp_feel;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public void setTemp_max(double temp_max) {
        this.temp_max = temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }

    public void setTemp_min(double temp_min) {
        this.temp_min = temp_min;
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
