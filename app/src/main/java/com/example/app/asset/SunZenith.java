package com.example.app.asset;

public class SunZenith {
    public String type;
    public Object value;
    public String name;
    public Meta meta;
    public Object timestamp;

    public SunZenith() {
    }

    public SunZenith(String type, Object value, String name, Meta meta, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
