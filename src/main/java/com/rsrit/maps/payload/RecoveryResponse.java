package com.rsrit.maps.payload;

import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rsrit.maps.model.Combination;
import com.rsrit.maps.model.RecoveryData;
import com.rsrit.maps.model.RecoveryInput;

public class RecoveryResponse {

    private RecoveryInput input;
    private Output output;

    public RecoveryResponse(RecoveryInput recoveryInput, RecoveryData recoveryData) {
        this.input = recoveryInput;
        fillOutput(recoveryData);
    }

    private void fillOutput(RecoveryData recoveryData) {
        this.output = new Output(recoveryData.getTotalRecoverableAmount(), recoveryData.getCombinations());
    }

    public RecoveryInput getInput() {
        return input;
    }

    public void setInput(RecoveryInput input) {
        this.input = input;
    }

    public Output getOutput() {
        return output;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }

    // Inner classes
    private class Output {
        public Double totalRecoverableAmount;
        public List<Combination> combinations;

        public Output(Double totalRecoverableAmount, List<Combination> combinations) {
            super();
            this.totalRecoverableAmount = totalRecoverableAmount;
            this.combinations = combinations;
        }
    }

}
