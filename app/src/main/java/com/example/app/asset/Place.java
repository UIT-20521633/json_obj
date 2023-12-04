package com.example.app.asset;

public class Place {
    public String type;
    public String value;
    public String name;
    public long timestamp;
    public Place() {
    }
    public Place(String type, String value, String name, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.timestamp = timestamp;
    }
}
