package com.example.bhuiy.weatherapp.AccessObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by bhuiy on 4/19/2017.
 */

public interface WeatherApi {
    @GET("v1/public/yql?q=select%20*%20from%20weather.forecast%20where%20woeid%20in%20(select%20woeid%20from%20geo.places(1)%20where%20text%3D%22nome%2C%20ak%22)&format=json&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys")
    Call<Weather> getWeatherData();
}
