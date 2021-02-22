package com.example.publictransport.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prefecture {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("Name")
    @Expose
    public String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}