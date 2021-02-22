package com.example.publictransport.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Station {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("Name")
    @Expose
    public String name;
    @SerializedName("Type")
    @Expose
    public Type type;
    @SerializedName("Yomi")
    @Expose
    public String yomi;



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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getYomi() {
        return yomi;
    }

    public void setYomi(String yomi) {
        this.yomi = yomi;
    }

}