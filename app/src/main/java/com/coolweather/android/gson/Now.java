package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wacy on 2017/8/9.
 */

public class Now {
    @SerializedName("cond")
    public More more;
    @SerializedName("tmp")
    public String temperature;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
