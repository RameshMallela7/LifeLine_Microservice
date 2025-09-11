package com.lifeline.public_user_service.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lifeline.public_user_service.entity.PublicUser;
import com.lifeline.public_user_service.service.PublicUserService;

import reactor.core.publisher.Flux;

@RestController
public class PublicUserController {
	
	@Autowired
	private PublicUserService publicUserService;

    @GetMapping("/user")
    public String getPublicUser() {
        return "null - getPublicUser"; // TODO>
    }

    @GetMapping("/all")
    public List<PublicUser> getPublicUsers() {
        return Collections.singletonList(PublicUser.builder().name("John").build()); // TODO>
    }
    
    @GetMapping(value = "/getStremsData", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<PublicUser> getData(){
    	return publicUserService.getFluxData();    			
    }
    
    @GetMapping("/getListData")
    public List<PublicUser> getListData(){
    	return publicUserService.getListData();    			
    	
    }
}
