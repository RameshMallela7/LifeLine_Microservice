package com.lifeline.hospital_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lifeline.hospital_user_service.service.HospitalService;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
//@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    private HospitalService hospitalService;

    @GetMapping("/hospital-user")
    public String getHospitalUser() {
        return restTemplate.getForObject("http://public-user-service/user", String.class);
    }

    @GetMapping("/all")
    public String getAllHospitalUsers() {
        return restTemplate.getForObject("http://public-user-service/all", String.class);
    }
    
   
    
    @PostMapping("/notify/{blood-group}")
    public String notify(@PathVariable("blood-group") String bloodgroup) {
    	System.out.println(bloodgroup);
        return hospitalService.notifyKafka(bloodgroup);
    }
    
    
    
   }
