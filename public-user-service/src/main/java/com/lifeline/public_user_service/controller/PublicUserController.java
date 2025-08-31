package com.lifeline.public_user_service.controller;

import com.lifeline.public_user_service.entity.PublicUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class PublicUserController {

    @RequestMapping("/user")
    public String getPublicUser() {
        return "null - getPublicUser"; // TODO>
    }

    @GetMapping("/all")
    public List<PublicUser> getPublicUsers() {
        return Collections.singletonList(PublicUser.builder().name("John").build()); // TODO>
    }
}
