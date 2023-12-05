package com.example.app;

import android.os.Bundle;
import android.util.JsonReader;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.app.asset.AQI;
import com.example.app.asset.Attributes;
import com.example.app.asset.asset;
import com.example.app.asset.Rainfall;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các phần tử giao diện
        TextView place =findViewById(R.id.place);
        TextView AirIndex=findViewById(R.id.AirIndex);
        TextView rate=findViewById(R.id.rate);
        RecyclerView rcv_Sun = findViewById(R.id.rcv_Sun);
        RecyclerView rcv_Weather = findViewById(R.id.rcv_Weather);
        RecyclerView rcv_Index = findViewById(R.id.rcv_Index);

        SunAdapter sunAdapter = new SunAdapter();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2);
        rcv_Sun.setLayoutManager(gridLayoutManager);
        rcv_Sun.setFocusable(false);
        rcv_Sun.setNestedScrollingEnabled(false);

        WeatherAdapter weatherAdapter = new WeatherAdapter();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rcv_Weather.setLayoutManager(linearLayoutManager);
        rcv_Weather.setFocusable(false);
        rcv_Weather.setNestedScrollingEnabled(false);

        IndexAdapter indexAdapter = new IndexAdapter();
        GridLayoutManager gridLayoutManager1 = new GridLayoutManager(this,4);
        rcv_Index.setLayoutManager(gridLayoutManager1);
        rcv_Index.setFocusable(false);
        rcv_Index.setNestedScrollingEnabled(false);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                List<asset> assetList = jsonReader.ConverJsonToObject(MainActivity.this);
                // Bên ngoài vòng lặp
                List<Sun> list1 = new ArrayList<>();
                List<Weather> list2 = new ArrayList<>();
                List<index> list3 = new ArrayList<>();

                for (asset Asset : assetList) {
                    if(Asset.id.equals("5zI6XqkQVSfdgOrZ1MyWEf")) {
                        place.setText(Asset.attributes.place.value);
                        AirIndex.setText("15");
                        rate.setText("GOOD");
                    list1.add(new Sun("Sun Altitude",
                            (String.valueOf(Asset.attributes.sunAltitude.value)) +" W/m²",
                            (R.drawable.ic_sunaltitude_mainboard)));
                    list1.add(new Sun("Sun Azimuth",
                            (String.valueOf(Asset.attributes.sunAzimuth.value))+"°",
                            (R.drawable.ic_sunazimuth_mainboard)));
                    list1.add(new Sun("Sun Irradiance",
                            (String.valueOf(Asset.attributes.sunIrradiance.value))+"°",
                            (R.drawable.ic_sunirradiance_mainboard)));
                    list1.add(new Sun("Sun Zenith",
                            (String.valueOf(Asset.attributes.sunZenith.value))+"°",
                            (R.drawable.ic_sunzenith_mainboard)));
                        //--------------------------------------------------
                         list2.add(new Weather("Rain fall",
                                (String.valueOf(Asset.attributes.rainfall.value))+" mm",
                                (R.drawable.ic_rainfall_mainboard)));
                        list2.add(new Weather("Temperature",
                                (String.valueOf(Asset.attributes.temperature.value))+ " °C",
                                (R.drawable.ic_temperature_mainboard)));
                        list2.add(new Weather("Humidity",
                                (String.valueOf(Asset.attributes.humidity.value))+" %",
                                (R.drawable.ic_humidity_mainboard)));
                        list2.add(new Weather("Wind Direction",
                                (String.valueOf(Asset.attributes.windDirection.value))+" °",
                                (R.drawable.ic_winddirection_mainboard)));
                        list2.add(new Weather("Wind Speed",
                                (String.valueOf(Asset.attributes.windSpeed.value))+" Km/h",
                                (R.drawable.ic_windspeed_mainboard)));
                        //------------------------------------------------------
                        list3.add(new index("PM25","3","µg/m3",
                                (R.drawable.ic_pm25_mainboard)));
                        list3.add(new index("PM10","6","µg/m3",
                                (R.drawable.ic_pm10_mainboard)));
                        list3.add(new index("CO2","350","PPM",
                                (R.drawable.ic_co2_mainboard)));
                        list3.add(new index("UV",
                                (String.valueOf(Asset.attributes.uVIndex.value)),"",
                                (R.drawable.ic_uvindex_mainboard)));


                    }
//                    //TPHCM
//                    if(Asset.id.equals("3xih2945Hes4yxpB15ZyKb")) {
//                        list1.add(new Sun("Sun Altitude","306 W/m²",
//                                (R.drawable.ic_sunaltitude_mainboard)));
//                        list1.add(new Sun("Sun Azimuth","237°",
//                                (R.drawable.ic_sunazimuth_mainboard)));
//                        list1.add(new Sun("Sun Irradiance","70°",
//                                (R.drawable.ic_sunirradiance_mainboard)));
//                        list1.add(new Sun("Sun Zenith","20°",
//                                (R.drawable.ic_sunzenith_mainboard)));
//                        //--------------------------------------------------
//                        list2.add(new Weather("Rain fall",
//                                (String.valueOf(Asset.attributes.rainfall.value))+" mm",
//                                (R.drawable.ic_rainfall_mainboard)));
//                        list2.add(new Weather("Temperature",
//                                (String.valueOf(Asset.attributes.temperature.value))+ "°C",
//                                (R.drawable.ic_temperature_mainboard)));
//                        list2.add(new Weather("Humidity",
//                                (String.valueOf(Asset.attributes.humidity.value))+"%",
//                                (R.drawable.ic_humidity_mainboard)));
//                        list2.add(new Weather("Wind Direction",
//                                (String.valueOf(Asset.attributes.windDirection.value))+"°",
//                                (R.drawable.ic_winddirection_mainboard)));
//                        list2.add(new Weather("Wind Speed",
//                                (String.valueOf(Asset.attributes.windSpeed.value))+" Km/h",
//                                (R.drawable.ic_windspeed_mainboard)));
//                        //------------------------------------------------------
//                        list3.add(new index("PM25","4","µg/m3",
//                                (R.drawable.ic_pm25_mainboard)));
//                        list3.add(new index("PM10","59","µg/m3",
//                                (R.drawable.ic_pm10_mainboard)));
//                        list3.add(new index("CO2","400","PPM",
//                                (R.drawable.ic_co2_mainboard)));
//                        list3.add(new index("UV", "6.0","",
//                                (R.drawable.ic_uvindex_mainboard)));


                    //}
//                    //HaNoi
//                    if(Asset.id.equals("4lt7fyHy3SZMgUsECxiOgQ")) {
//                        list1.add(new Sun("Sun Altitude",
//                                 "284 W/m²",
//                                (R.drawable.ic_sunaltitude_mainboard)));
//                        list1.add(new Sun("Sun Azimuth",
//                                "237°",
//                                (R.drawable.ic_sunazimuth_mainboard)));
//                        list1.add(new Sun("Sun Irradiance",
//                                "72°",
//                                (R.drawable.ic_sunirradiance_mainboard)));
//                        list1.add(new Sun("Sun Zenith",
//                                "18°",
//                                (R.drawable.ic_sunzenith_mainboard)));
//                        //--------------------------------------------------
//                        list2.add(new Weather("Rain fall",
//                                (String.valueOf(Asset.attributes.rainfall.value))+" mm",
//                                (R.drawable.ic_rainfall_mainboard)));
//                        list2.add(new Weather("Temperature",
//                                (String.valueOf(Asset.attributes.temperature.value))+ " °C",
//                                (R.drawable.ic_temperature_mainboard)));
//                        list2.add(new Weather("Humidity",
//                                (String.valueOf(Asset.attributes.humidity.value))+" %",
//                                (R.drawable.ic_humidity_mainboard)));
//                        list2.add(new Weather("Wind Direction",
//                                (String.valueOf(Asset.attributes.windDirection.value))+" °",
//                                (R.drawable.ic_winddirection_mainboard)));
//                        list2.add(new Weather("Wind Speed",
//                                (String.valueOf(Asset.attributes.windSpeed.value))+" Km/h",
//                                (R.drawable.ic_windspeed_mainboard)));
//                        //------------------------------------------------------
//                        if (Asset != null && Asset.attributes != null && Asset.attributes.pM25 != null ) {
//                            list3.add(new index("PM25",(String.valueOf(Asset.attributes.pM25.value)),"µm/m3", (R.drawable.ic_pm25_mainboard)));
//                        }
//                        list3.add(new index("PM10",(String.valueOf(Asset.attributes.pM10.value)),"µm/m3",
//                                (R.drawable.ic_pm10_mainboard)));
//                        list3.add(new index("CO2",(String.valueOf(Asset.attributes.cO2.value)),"PPM",
//                                (R.drawable.ic_co2_mainboard)));
//                        list3.add(new index("UV",(String.valueOf(Asset.attributes.uVIndex.value)),"",
//                                (R.drawable.ic_uvindex_mainboard)));


                    //}
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {

                        // Sau khi vòng lặp hoàn thành, cập nhật dữ liệu cho Adapter và RecyclerView
                        sunAdapter.setData(list1);
                        rcv_Sun.setAdapter(sunAdapter);
                        //-------------------------------
                        weatherAdapter.setData(list2);
                        rcv_Weather.setAdapter(weatherAdapter);

                        indexAdapter.setData(list3);
                        rcv_Index.setAdapter(indexAdapter);
                    }
                });
            }
        });
    }


}
