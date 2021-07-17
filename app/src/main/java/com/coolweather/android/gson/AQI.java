package com.coolweather.android.gson;
//
//"aqi":{
//        "city":{
//        "aqi":"44",
//        "pm25":"13"
//        }
//        }
//
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;

        public String pm25;

    }

}