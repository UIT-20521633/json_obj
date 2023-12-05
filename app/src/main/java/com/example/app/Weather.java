package com.example.app;

public class Weather {
    public String weatherName;
    public  String weatherValue;
    public int resourceId;

    public Weather() {
    }

    public Weather(String weatherName, String weatherValue, int resourceId) {
        this.weatherName = weatherName;
        this.weatherValue = weatherValue;
        this.resourceId = resourceId;
    }
}
