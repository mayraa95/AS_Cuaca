package com.mayaanugrahsyafira202102344.cuaca;

public class WeatherModel {
    private String main;
    private String description;

    public
    String getMain() {
        return main;
    }

    public
    void setMain(String main) {
        this.main = main;
    }

    public
    String getDescription() {
        return description;
    }

    public
    void setDescription(String description) {
        this.description = description;
    }

    public
    String getIcon() {
        return icon;
    }

    public
    void setIcon(String icon) {
        this.icon = icon;
    }

    private String icon;
}
