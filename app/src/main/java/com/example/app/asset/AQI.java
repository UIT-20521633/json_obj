package com.example.app.asset;

public class AQI {
    public String type;
    public int value;
    public String name;
    public Meta meta;
    public long timestamp;

    public AQI(String type, int value, String name, Meta meta, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }

    public AQI() {
    }

}
