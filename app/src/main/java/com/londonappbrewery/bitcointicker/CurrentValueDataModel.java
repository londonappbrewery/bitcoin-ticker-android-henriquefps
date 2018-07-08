package com.londonappbrewery.bitcointicker;

import com.loopj.android.http.JsonHttpResponseHandler;

import org.json.JSONObject;

public class CurrentValueDataModel {
    private double currentValue;

    public static CurrentValueDataModel fromJSON(JSONObject response){
        try {
            CurrentValueDataModel data = new CurrentValueDataModel();
            data.currentValue = response.getDouble("last");
            return data;
        } catch (Exception e){return null;}
    }

    public double getCurrentValue() {
        return currentValue;
    }
}
