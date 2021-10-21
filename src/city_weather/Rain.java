package city_weather;

import com.google.gson.annotations.SerializedName;

public class Rain {
    // Paramètres optionnels, initialisés par défaut
    @SerializedName("1h")
    private double volume_1h = 0;

    @SerializedName("3h")
    private double volume_3h = 0;

    // Constructeur
    //public Rain() { }

    public Rain(double volume_1h, double volume_3h) {
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
