package com.example.app.asset;

public class Meta {
    public boolean readOnly;
    public boolean storeDataPoints;
    public Object forecast;
    public boolean showOnDashboard;
    public Object format;
    public String label;
    public boolean ruleState;

    public Meta() {
    }

    public Meta(boolean readOnly, boolean storeDataPoints, Object forecast, boolean showOnDashboard, Object format, String label, boolean ruleState) {
        this.readOnly = readOnly;
        this.storeDataPoints = storeDataPoints;
        this.forecast = forecast;
        this.showOnDashboard = showOnDashboard;
        this.format = format;
        this.label = label;
        this.ruleState = ruleState;
    }
}
