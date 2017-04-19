package com.example.bhuiy.weatherapp.AccessObject;

import com.example.bhuiy.weatherapp.WeatherApi.Query;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by bhuiy on 4/17/2017.
 */

public class Weather {

    private static String Daily_URL="https://query.yahooapis.com/v1/public/";
    @SerializedName("query")
    @Expose
    private Query query;

    
    public Query getQuery() {
        return query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }
}
