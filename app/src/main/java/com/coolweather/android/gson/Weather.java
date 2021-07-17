package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;


//汇总前面所有的天气信息对象

import java.util.List;

public class Weather {

    //接口返回数据状态：成功返回OK，失败返回失败原因
    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    //数组里的每一个元素都是Forecast对象
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}