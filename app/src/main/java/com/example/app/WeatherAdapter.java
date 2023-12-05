package com.example.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.WeatherViewHolder> {
    public List<Weather> weatherList;
    public void setData(List<Weather> list){
        this.weatherList=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public WeatherViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_weather,parent,false);
        return new WeatherViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WeatherViewHolder holder, int position) {
        Weather weather = weatherList.get(position);
        if(weather == null){
            return;
        }
        holder.ic_Weather.setImageResource(weather.resourceId);
        holder.WeatherName.setText(weather.weatherName);
        holder.WeatherValue.setText(weather.weatherValue);
    }

    @Override
    public int getItemCount() {
        if(weatherList != null){
            return weatherList.size();
        }
        return 0;
    }

    public class WeatherViewHolder extends RecyclerView.ViewHolder{
        public TextView WeatherName;
        public TextView WeatherValue;
        public ImageView ic_Weather;
        public WeatherViewHolder(@NonNull View itemView) {
            super(itemView);
            WeatherName = itemView.findViewById(R.id.item_weather_name);
            WeatherValue = itemView.findViewById(R.id.item_weather_value);
            ic_Weather = itemView.findViewById(R.id.ic_weather);
        }
    }
}
