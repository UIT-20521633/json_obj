package com.example.app.asset;

public class Location {
    public String type;
    public Value value;
    public String name;
    public Object timestamp;

    public Location() {
    }
    public Location(String type, Value value, String name, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.timestamp = timestamp;
    }
}
