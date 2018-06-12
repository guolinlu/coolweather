package com.example.lenovo.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lenovo on 2018/6/12.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}