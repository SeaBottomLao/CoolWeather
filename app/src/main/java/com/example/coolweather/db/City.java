package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

public class City extends DataSupport {
    private int id;
    private String cityName;//记录市的名字
    private int cityCode;//市的代号
    private int provinceId;//市的id
    public int getId(){
        return id;
    }
    private void setId(int id){
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId){
        this.provinceId = provinceId;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
}
