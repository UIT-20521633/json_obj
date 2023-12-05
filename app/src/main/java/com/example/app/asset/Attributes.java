package com.example.app.asset;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Attributes { //Thuộc tính
    public SunIrradiance sunIrradiance; //bức xạ mặt trời
    public Rainfall rainfall; //Lượng mưa
    public Notes notes;
    public UVIndex uVIndex; //Chỉ số UV
    public  SunAzimuth sunAzimuth; //Phương vị mặt trời
    public  SunZenith sunZenith; //Thiên đỉnh mặt trời
    public  Tags tags;
    public  Manufacturer manufacturer; //Chế tạo
    public  Temperature temperature; //Nhiệt độ
    public  Humidity humidity; //Độ ẩm
    public  Location location;
    public  Place place;
    public  WindDirection windDirection; //Hướng gió
    public  WindSpeed windSpeed; //Tốc độ gió
    public  SunAltitude sunAltitude; //Độ cao mặt trời
    @JsonProperty("PM25")
    public PM25 pM25;
    @JsonProperty("CO2")
    public CO2 cO2;
    @JsonProperty("AQI_Predict")
    public AQIPredict aQI_Predict;
    @JsonProperty("AQI")
    public AQI aQI;
    @JsonProperty("PM10")
    public PM10 pM10;


    public Attributes() {
    }

    public Attributes(SunIrradiance sunIrradiance, Rainfall rainfall, Notes notes, UVIndex uVIndex, SunAzimuth sunAzimuth, SunZenith sunZenith, Tags tags, Manufacturer manufacturer, Temperature temperature, Humidity humidity, Location location, Place place, WindDirection windDirection, WindSpeed windSpeed, SunAltitude sunAltitude, PM25 pM25, CO2 cO2, AQIPredict aQI_Predict, AQI aQI, PM10 pM10) {
        this.sunIrradiance = sunIrradiance;
        this.rainfall = rainfall;
        this.notes = notes;
        this.uVIndex = uVIndex;
        this.sunAzimuth = sunAzimuth;
        this.sunZenith = sunZenith;
        this.tags = tags;
        this.manufacturer = manufacturer;
        this.temperature = temperature;
        this.humidity = humidity;
        this.location = location;
        this.place = place;
        this.windDirection = windDirection;
        this.windSpeed = windSpeed;
        this.sunAltitude = sunAltitude;
        this.pM25 = pM25;
        this.cO2 = cO2;
        this.aQI_Predict = aQI_Predict;
        this.aQI = aQI;
        this.pM10 = pM10;
    }
}
