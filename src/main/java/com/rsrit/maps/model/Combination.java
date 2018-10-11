package com.rsrit.maps.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Combination {
    public String combinationName;
    public Double amount;

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }

    public Combination(String combinationName, Double amount) {
        super();
        this.combinationName = combinationName;
        this.amount = amount;
    }

    public String getCombinationName() {
        return combinationName;
    }

    public void setCombinationName(String combinationName) {
        this.combinationName = combinationName;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

}