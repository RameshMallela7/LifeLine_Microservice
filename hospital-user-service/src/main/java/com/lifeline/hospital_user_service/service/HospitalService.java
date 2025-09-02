package com.lifeline.hospital_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplet;
	
	
	public String testKafka(String body) {
		kafkaTemplet.send("lifelineTopic", "Test mesage from application : "+body);
		System.out.println("sent sucessfully");
		return "sent sucessfully";
		
	}

}
