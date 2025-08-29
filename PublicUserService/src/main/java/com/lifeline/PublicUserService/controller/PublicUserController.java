package com.lifeline.PublicUserService.controller;

import com.lifeline.PublicUserService.entity.PublicUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/public")
public class PublicUserController {
    public PublicUserController() {
    }

    @GetMapping("/all")
    public List<PublicUser> getAllUsers() {

        return Arrays.asList(
            new PublicUser("John", "John@example.com", "1234567890", "A+", "https://example.com/adar.jpg", "https://example.com/bloodcertificate.jpg", "password123"),
            new PublicUser("Jane", "Jane@example.com", "9876543210", "B-", "https://example.com/adar.jpg", "https://example.com/bloodcertificate.jpg", "password456"),
            new PublicUser("Bob", "Bob@example.com", "5555555555", "O+", "https://example.com/adar.jpg", "https://example.com/bloodcertificate.jpg", "password789")

        );
    }




}
