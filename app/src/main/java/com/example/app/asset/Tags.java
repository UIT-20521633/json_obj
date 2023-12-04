package com.example.app.asset;

import java.util.ArrayList;

public class Tags {
    public String type;
    public ArrayList<String> value;
    public String name;
    public Meta meta;
    public long timestamp;

    public Tags() {
    }

    public Tags(String type, ArrayList<String> value, String name, Meta meta, long timestamp) {
        this.type = type;
        this.value = value;
        this.name = name;
        this.meta = meta;
        this.timestamp = timestamp;
    }
}
