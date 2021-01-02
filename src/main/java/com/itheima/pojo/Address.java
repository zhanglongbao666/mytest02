package com.itheima.pojo;

import java.io.Serializable;

public class Address implements Serializable {

    private String provinceName;
    private String cityName;
    
	//省略了set/get...

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}