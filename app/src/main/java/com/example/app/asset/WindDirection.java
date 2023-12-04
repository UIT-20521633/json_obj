package com.example.app.asset;

public class WindDirection {
    public String type;
    public int value;
    public String name;
    public Meta meta;
    public Object timestamp;
    public WindDirection() {
    }
    public WindDirection(String type, int value, String name, Meta meta, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
