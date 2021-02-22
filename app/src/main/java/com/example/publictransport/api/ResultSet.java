package com.example.publictransport.api;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ResultSet {

    @SerializedName("apiVersion")
    @Expose
    public String apiVersion;
    @SerializedName("engineVersion")
    @Expose
    public String engineVersion;
    @SerializedName("offset")
    @Expose
    public String offset;
    @SerializedName("limit")
    @Expose
    public String limit;
    @SerializedName("Point")
    @Expose
    public List<Point> point = null;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public List<Point> getPoint() {
        return point;
    }

    public void setPoint(List<Point> point) {
        this.point = point;
    }

}