package com.example.publictransport.api;

import retrofit2.Call;
import retrofit2.http.GET;

import retrofit2.http.Query;

public interface RetrofitService {

    String URL = "https://mixway.ekispert.jp";


    @GET("/v1/json/geo/point")
    Call<Result> getData(@Query("key") String key,@Query("geoPoint") String geoPoint,@Query("type") String type);




}