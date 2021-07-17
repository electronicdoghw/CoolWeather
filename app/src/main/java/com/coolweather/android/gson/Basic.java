package com.coolweather.android.gson;

//"basic":{
//        "city": "苏州",
//        "id": "CNXX5s4dfadfF"
//        "update":{
//        "loc":"2016-08-08 21:58"
//        }
//        }

import com.google.gson.annotations.SerializedName;

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
