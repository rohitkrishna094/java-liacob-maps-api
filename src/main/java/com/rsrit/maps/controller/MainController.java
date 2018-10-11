package com.rsrit.maps.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rsrit.maps.model.RecoveryInput;
import com.rsrit.maps.service.DataService;

@RestController
@RequestMapping("/api")
public class MainController {

    @Autowired
    DataService dataService;

    // @formatter:off
    @GetMapping("/recover")
    public String test() {
        return "hello";
    }
    
    @GetMapping(value = "/recovery", params = { "stateName", "stateId", "groupMembers", "individualMembers", "medicareMembers", "medicaidMembers" })
    public String getRecoverableAmount(
            @RequestParam("stateName") String stateName, 
            @RequestParam("stateId") int stateId, 
            @RequestParam("groupMembers") int groupMembers,
            @RequestParam("individualMembers") int individualMembers, 
            @RequestParam("medicareMembers") int medicareMembers, 
            @RequestParam("medicaidMembers") int medicaidMembers) {
        
       RecoveryInput recoveryInput = new RecoveryInput(stateName, stateId, groupMembers, individualMembers, medicareMembers, medicaidMembers); 
       return dataService.getRecoverableAmount(recoveryInput);
    }
    
    @GetMapping(value = "/recovery", params = {  "groupMembers", "individualMembers", "medicareMembers", "medicaidMembers" })
    public String getRecoverableAmountDefaultState(
            @RequestParam("groupMembers") int groupMembers,
            @RequestParam("individualMembers") int individualMembers, 
            @RequestParam("medicareMembers") int medicareMembers, 
            @RequestParam("medicaidMembers") int medicaidMembers) {

        RecoveryInput recoveryInput = new RecoveryInput("MI", 26, groupMembers, individualMembers, medicareMembers, medicaidMembers); 
        return dataService.getRecoverableAmount(recoveryInput);
    }
    // @formatter:on

}
