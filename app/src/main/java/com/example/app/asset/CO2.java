package com.example.app.asset;

public class CO2 {
    public String type;
    public int value;
    public String name;
    public Meta meta;
    public long timestamp;
    public CO2() {
    }
    public CO2(String type, int value, String name, Meta meta, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
