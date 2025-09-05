package com.lifeline.public_user_service.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
@Entity
@Table(name = "public_users")
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublicUser {
	private Integer id;
    private String name;
    private String email;
    private String phone;
    private String bloodGroup;
    private String adarS3Path;
    private String bloodCertificateS3Path;
    private String passwordHash;
}



