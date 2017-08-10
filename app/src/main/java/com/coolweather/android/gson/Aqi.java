package com.coolweather.android.gson;

/**
 * Created by wacy on 2017/8/9.
 */

public class Aqi {
    public AqiCity city;

    public class AqiCity {
        public String aqi;
        public String pm25;
    }
}
