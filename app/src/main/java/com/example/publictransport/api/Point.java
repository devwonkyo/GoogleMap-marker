package com.example.publictransport.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Point {

    @SerializedName("Station")
    @Expose
    public Station station;
    @SerializedName("Prefecture")
    @Expose
    public Prefecture prefecture;
    @SerializedName("GeoPoint")
    @Expose
    public GeoPoint geoPoint;
    @SerializedName("Distance")
    @Expose
    public String distance;

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public Prefecture getPrefecture() {
        return prefecture;
    }

    public void setPrefecture(Prefecture prefecture) {
        this.prefecture = prefecture;
    }

    public GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

}