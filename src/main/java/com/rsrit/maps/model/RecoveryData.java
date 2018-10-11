package com.rsrit.maps.model;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RecoveryData {

    public Double totalRecoverableAmount;
    public List<Combination> combinations;

    public RecoveryData() {

    }

    public Double getTotalRecoverableAmount() {
        return totalRecoverableAmount;
    }

    public void setTotalRecoverableAmount(Double totalRecoverableAmount) {
        this.totalRecoverableAmount = totalRecoverableAmount;
    }

    public List<Combination> getCombinations() {
        return combinations;
    }

    public void setCombinations(List<Combination> combinations) {
        this.combinations = combinations;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }
}
