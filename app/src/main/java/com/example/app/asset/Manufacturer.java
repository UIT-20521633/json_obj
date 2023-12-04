package com.example.app.asset;

public class Manufacturer {
    public String type;
    public String value;
    public String name;
    public Meta meta;
    public long timestamp;
    public Manufacturer() {
    }
    public Manufacturer(String type, String value, String name, Meta meta, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
