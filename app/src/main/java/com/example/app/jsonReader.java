package com.example.app;

import android.content.Context;

import com.example.app.asset.asset;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.List;

public class jsonReader {
    public static List<asset> ConverJsonToObject(Context context){
        InputStream inputStream = context.getResources().openRawResource(R.raw.asset1);
        String jsonString = "";
        try {
            byte[] data = new byte[inputStream.available()];
            inputStream.read(data);
            inputStream.close();
            jsonString = new String(data, "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // Sử dụng TypeToken cho một danh sách hoặc mảng đối tượng asset
        Type listType = new TypeToken<List<asset>>(){}.getType();
        return new Gson().fromJson(jsonString, listType);
    }
}
