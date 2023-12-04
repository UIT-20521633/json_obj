package com.example.app;

import android.os.Bundle;
import android.util.JsonReader;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.app.asset.AQI;
import com.example.app.asset.Attributes;
import com.example.app.asset.asset;
import com.example.app.asset.Rainfall;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các phần tử giao diện
        TextView rainfall1 = findViewById(R.id.rainfall);
        TextView uVIndex =findViewById(R.id.UVIndex);
        TextView manufacturer =findViewById(R.id.manufacturer);
        TextView temperature =findViewById(R.id.temperature);
        TextView humidity =findViewById(R.id.humidityTextView);
        TextView location =findViewById(R.id.locationTV);
        TextView place =findViewById(R.id.place);
        TextView windDirection =findViewById(R.id.windDirectionTextView);
        TextView windSpeed =findViewById(R.id.windSpeedTextView);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                List<asset> assetList = jsonReader.ConverJsonToObject(MainActivity.this);
// Xử lý danh sách các đối tượng Asset ở đây

                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        for (asset Asset : assetList) {
                            if (Asset.id.equals("5zI6XqkQVSfdgOrZ1MyWEf")) {
                                String firstCoordinate = String.valueOf(Asset.attributes.location.value.coordinates.get(0));
                                String secondCoordinate = String.valueOf(Asset.attributes.location.value.coordinates.get(1));
                                rainfall1.setText("Luong mưa: " + String.valueOf(Asset.attributes.rainfall.value));
                                uVIndex.setText("Chỉ số UV: " + String.valueOf(Asset.attributes.uVIndex.value));
                                manufacturer.setText("Nhà sản xuất: " + Asset.attributes.manufacturer.value);
                                temperature.setText("Nhiệt độ: " + String.valueOf(Asset.attributes.temperature.value));
                                humidity.setText("Đổ ẩm: " + String.valueOf(Asset.attributes.humidity.value));
                                location.setText("Location: [" + firstCoordinate + "," + secondCoordinate + "]");
                                place.setText(Asset.attributes.place.value);
                                windDirection.setText("Hướng gió: " + String.valueOf(Asset.attributes.windDirection.value) );
                                windSpeed.setText("Tốc độ gió: " + String.valueOf(Asset.attributes.windSpeed.value));
                                // Thoát khỏi vòng lặp nếu đã tìm thấy đối tượng có ID mong muốn
                                break;
                            }
                        }
                    }
                });
            }
        });

//
//        // Giả định chuỗi JSON đã được truyền vào từ nguồn nào đó
//        String jsonStr = ""; // Thay bằng chuỗi JSON thực tế
//
//        try {
//            // Chuyển đổi chuỗi JSON thành đối tượng JSONObject
//            JSONObject jsonObj = new JSONObject(jsonStr);
//
//            // Lấy các thông tin từ JSON
//            String place = jsonObj.getString("place");
//            String temperature = jsonObj.getString("temperature");
//            String weatherDescription = jsonObj.getString("weatherDescription");
//            // Lấy icon thời tiết từ JSON và ánh xạ vào ImageView weatherIconImageView
//            int weatherIconResId = getResources().getIdentifier(jsonObj.getString("weatherIcon"), "drawable", getPackageName());
//            int humidity = jsonObj.getInt("humidity");
//            double windSpeed = jsonObj.getDouble("windSpeed");
//            String otherDetails = jsonObj.getString("otherDetails");
//
//            // Gán dữ liệu từ JSON vào các phần tử giao diện
//            placeTextView.setText(place);
//            temperatureTextView.setText(temperature);
//            weatherDescriptionTextView.setText(weatherDescription);
//            weatherIconImageView.setImageResource(weatherIconResId);
//            humidityTextView.setText("Humidity: " + humidity);
//            windTextView.setText("Wind: " + windSpeed + " m/s");
//            otherDetailsTextView.setText(otherDetails);
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
    }
}
