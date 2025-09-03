package com.lifeline.hospital_user_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lifeline.hospital_user_service.service.HospitalService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
    
    @GetMapping("/all1")
    public String getAllHospitalUsers1() {
        return "internal string from Hospital service";
    }
    
    
    @GetMapping("/path/{body}")
    public String postMethodName(@PathVariable("body") String body) {

    	System.out.println(body);
        return hospitalService.testKafka(body);
    }
    
    
    
    @GetMapping("/dummy123")
    public String postMethodName1(@RequestParam(name= "body") String body) {

    	System.out.println(body);
        return body;
    }
    
   }
