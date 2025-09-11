package com.lifeline.hospital_user_service.model;

public record BloodGroupRequest(String bloodGroup, Location location) {
	
	public BloodGroupRequest {
        if (bloodGroup == null || bloodGroup.isBlank()) {
            throw new IllegalArgumentException("Blood group cannot be null or empty");
        }
        if (location == null) {
            throw new IllegalArgumentException("Location cannot be null");
        }
    }

}
