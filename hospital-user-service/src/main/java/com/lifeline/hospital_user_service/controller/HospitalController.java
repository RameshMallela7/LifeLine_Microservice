package com.lifeline.hospital_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/hospital")
public class HospitalController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/hospital-user")
    public String getHospitalUser() {
        return restTemplate.getForObject("http://public-user-service/public/user", String.class);
    }

    @GetMapping("/all")
    public String getAllHospitalUsers() {
        return restTemplate.getForObject("http://public-user-service/public/all", String.class);
    }
    
    @GetMapping("/all1")
    public String getAllHospitalUsers1() {
        return "internal string from Hospital";
    }
    
    
   }
