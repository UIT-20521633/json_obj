package com.example.app.asset;

import java.util.ArrayList;

public class Value {
    public ArrayList<Double> coordinates;
    public String type;

    public Value() {
    }
    public Value(ArrayList<Double> coordinates, String type) {
        this.coordinates = coordinates;
        this.type = type;
    }
}
