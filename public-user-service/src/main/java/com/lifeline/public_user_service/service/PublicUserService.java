package com.lifeline.public_user_service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lifeline.public_user_service.CommonConfiguration;
import com.lifeline.public_user_service.entity.PublicUser;

import reactor.core.publisher.Flux;

@Service
public class PublicUserService {
	
	@Autowired
	private CommonConfiguration commonConfiguration;

	public Flux<PublicUser> getFluxData() {
		System.out.println("PublicUserService.getFluxData() - "+commonConfiguration.publicUserList.size());
		return Flux.fromIterable(commonConfiguration.publicUserList);
				//.delayElements(Duration.ofSeconds(2));
	}

	public List<PublicUser> getListData() {
		System.out.println("PublicUserService.getListData() - "+commonConfiguration.publicUserList.size());
		return commonConfiguration.publicUserList;
	}
	
}
