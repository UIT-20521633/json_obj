package com.example.app.asset;

public class Notes {
    public String type;
    public Object value;
    public String name;
    public Object timestamp;

    public Notes() {
    }

    public Notes(String type, Object value, String name, Object timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.timestamp = timestamp;
    }
}
