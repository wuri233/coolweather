package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/16.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId(){
        this.id=id;
        return  id;
    }
    public String getCountyName() {
        this.countyName = countyName;
        return countyName;
    }
    public String WeatherId() {
        this.weatherId = weatherId;
        return weatherId;
    }
    public int getCityId() {
        this.cityId = cityId;
        return cityId;
    }
}
