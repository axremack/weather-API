package city_weather;

public class Wind {
    // Paramètres obligatoires
    private double wind_speed;
    private double wind_direction;  //(maybe int ?)

    // Paramètres optionnels
    private double wing_gust;   //(metter/sec)

    // Constructeurs
    public Wind(double wind_speed, double wind_direction, double wing_gust) {
        this.wind_speed = wind_speed;
        this.wind_direction = wind_direction;
        this.wing_gust = wing_gust;
    }

    // Getters et setters
    public double getWind_speed() {
        return wind_speed;
    }

    public void setWind_speed(double wind_speed) {
        this.wind_speed = wind_speed;
    }

    public double getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(double wind_direction) {
        this.wind_direction = wind_direction;
    }

    public double getWing_gust() {
        return wing_gust;
    }

    public void setWing_gust(double wing_gust) {
        this.wing_gust = wing_gust;
    }

}
