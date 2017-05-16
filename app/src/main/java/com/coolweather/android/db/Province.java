package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/5/16.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId(){
        this.id=id;
        return  id;
    }
    public String getProvinceName() {
        this.provinceName = provinceName;
        return provinceName;
    }
    public int getProvinceCode() {
        this.provinceCode = provinceCode;
        return provinceCode;
    }
}
