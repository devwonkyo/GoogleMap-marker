package com.example.publictransport.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GeoPoint {

    @SerializedName("longi")
    @Expose
    public String longi;
    @SerializedName("lati")
    @Expose
    public String lati;
    @SerializedName("longi_d")
    @Expose
    public String longi_d;
    @SerializedName("gcs")
    @Expose
    public String gcs;
    @SerializedName("lati_d")
    @Expose
    public String lati_d;

    public String getLongi() {
        return longi;
    }

    public void setLongi(String longi) {
        this.longi = longi;
    }

    public String getLati() {
        return lati;
    }

    public void setLati(String lati) {
        this.lati = lati;
    }

    public String getLongi_d() {
        return longi_d;
    }

    public void setLongi_d(String longi_d) {
        this.longi_d = longi_d;
    }

    public String getGcs() {
        return gcs;
    }

    public void setGcs(String gcs) {
        this.gcs = gcs;
    }

    public String getLati_d() {
        return lati_d;
    }

    public void setLati_d(String lati_d) {
        this.lati_d = lati_d;
    }

}