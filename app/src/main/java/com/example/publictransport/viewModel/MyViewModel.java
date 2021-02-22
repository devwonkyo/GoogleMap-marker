package com.example.publictransport.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.publictransport.api.GeoPoint;
import com.example.publictransport.api.Point;
import com.example.publictransport.api.Result;
import com.example.publictransport.api.ResultSet;
import com.example.publictransport.api.RetrofitService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyViewModel extends ViewModel {
    String KEY = "test_bD3vzeXPQ47";
    String GEOPOINT;
    String RADIUS = ",500";
    private MutableLiveData<List<GeoPoint>> geoPointLivedata;
    List<GeoPoint> geoPointList;

    public MyViewModel() {
        geoPointLivedata = new MutableLiveData<>();
        geoPointList = new ArrayList<>();
    }

    public void setGEOPOINT(String GEOPOINT) {
        this.GEOPOINT = GEOPOINT;
    }

    public MutableLiveData<List<GeoPoint>> getGeoPointLivedata(){
        return geoPointLivedata;
    }

    public void apiCall(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(RetrofitService.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitService retrofitService = retrofit.create(RetrofitService.class);

        retrofitService.getData(KEY,GEOPOINT+",500","bus.local").enqueue(new Callback<Result>() {
            @Override
            public void onResponse(Call<Result> call, Response<Result> response) {
                if(response.isSuccessful()){
                    Result result = response.body();
                    ResultSet resultSet = result.getResultSet();
                    List<Point> pointList = resultSet.getPoint();

                    for(Point point : pointList){
                        GeoPoint geoPoint = point.getGeoPoint();
                        geoPointList.add(geoPoint);
                    }
                    geoPointLivedata.setValue(geoPointList);
                }else{
                    Log.e("TAG", "실패");
                }
            }

            @Override
            public void onFailure(Call<Result> call, Throwable t) {
                Log.e("TAG", t.toString());
            }
        });

    }



}