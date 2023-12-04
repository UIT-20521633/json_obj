package com.example.app;

import com.example.app.asset.asset;

import retrofit2.Call;
import retrofit2.http.GET;

public interface WeatherAPI {
    @GET("weather") // Replace with your API endpoint
    Call<asset> getWeather();
}
