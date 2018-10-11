package com.rsrit.maps.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class RecoveryInput {

    private String stateName;
    private Integer stateId;
    private Integer groupMembers, individualMembers, medicareMembers, medicaidMembers;

    @Override
    public String toString() {
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        return gson.toJson(this);
    }

    public RecoveryInput(String stateName, Integer stateId, Integer groupMembers, Integer individualMembers, Integer medicareMembers, Integer medicaidMembers) {
        super();
        this.stateName = stateName;
        this.stateId = stateId;
        this.groupMembers = groupMembers;
        this.individualMembers = individualMembers;
        this.medicareMembers = medicareMembers;
        this.medicaidMembers = medicaidMembers;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getGroupMembers() {
        return groupMembers;
    }

    public void setGroupMembers(Integer groupMembers) {
        this.groupMembers = groupMembers;
    }

    public Integer getIndividualMembers() {
        return individualMembers;
    }

    public void setIndividualMembers(Integer individualMembers) {
        this.individualMembers = individualMembers;
    }

    public Integer getMedicareMembers() {
        return medicareMembers;
    }

    public void setMedicareMembers(Integer medicareMembers) {
        this.medicareMembers = medicareMembers;
    }

    public Integer getMedicaidMembers() {
        return medicaidMembers;
    }

    public void setMedicaidMembers(Integer medicaidMembers) {
        this.medicaidMembers = medicaidMembers;
    }

}
