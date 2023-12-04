package com.example.app.asset;

public class Rainfall {
    public  String type;
    public  double value;
    public  String name;
    public  Meta meta;
    public  Object timestamp;

    public Rainfall() {
    }
    public Rainfall(String type, double value, String name, Meta meta, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
