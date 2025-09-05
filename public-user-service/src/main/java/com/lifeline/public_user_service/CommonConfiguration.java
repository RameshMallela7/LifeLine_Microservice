package com.lifeline.public_user_service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.lifeline.public_user_service.entity.PublicUser;

@Component
@Configuration
public class CommonConfiguration implements CommandLineRunner {
	
	public List<PublicUser> publicUserList;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CommonConfiguration.run  -> startup runner");
		publicUserList = new ArrayList<>();
		for(int i=1 ; i<=100_000 ; i++) {			
			publicUserList.add(PublicUser.builder().id(i).name("Ram"+i).build());
		}
		
	}

}
