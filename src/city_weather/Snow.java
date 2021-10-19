package city_weather;

public class Snow {
    // Paramètres obligatoires
    private double volume_1h;
    private double volume_3h;

    // Constructeur
    public Snow(double volume_1h, double volume_3h) {
        this.volume_1h = volume_1h;
        this.volume_3h = volume_3h;
    }

    // Getters et setters
    public double getVolume_1h() {
        return volume_1h;
    }

    public void setVolume_1h(double volume_1h) {
        this.volume_1h = volume_1h;
    }

    public double getVolume_3h() {
        return volume_3h;
    }

    public void setVolume_3h(double volume_3h) {
        this.volume_3h = volume_3h;
    }

}
