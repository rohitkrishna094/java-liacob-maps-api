package com.rsrit.maps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rsrit.maps.dao.RecoveryDao;
import com.rsrit.maps.model.RecoveryData;
import com.rsrit.maps.model.RecoveryInput;
import com.rsrit.maps.payload.RecoveryResponse;

@Service
public class DataService {

    @Autowired
    RecoveryDao recoveryDao;

    public DataService() {

    }

    public String getRecoverableAmount(RecoveryInput recoveryInput) {

        // Get corresponding data from database Lets call it RecoveryData
        RecoveryData recoveryData = recoveryDao.getRecoveryData();
        return new RecoveryResponse(recoveryInput, recoveryData).toString();
    }

}
