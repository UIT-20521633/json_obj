package com.example.app.asset;

public class PM10 {
    public String type;
    public double value;
    public String name;
    public Meta meta;
    public long timestamp;

    public PM10() {
    }

    public PM10(String type, double value, String name, Meta meta, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
