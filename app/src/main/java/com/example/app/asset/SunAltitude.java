package com.example.app.asset;

public class SunAltitude {
    public String type;
    public Object value;
    public String name;
    public Meta meta;
    public Object timestamp;

    public SunAltitude() {
    }
    public SunAltitude(String type, Object value, String name, Meta meta, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
