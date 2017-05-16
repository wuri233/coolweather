package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/16.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId(){
        this.id=id;
        return  id;
    }
    public String getCityName() {
        this.cityName = cityName;
        return cityName;
    }
    public int getCityCode() {
        this.cityCode = cityCode;
        return cityCode;
    }
    public int getProvinceId() {
        this.provinceId = provinceId;
        return provinceId;
    }
}
