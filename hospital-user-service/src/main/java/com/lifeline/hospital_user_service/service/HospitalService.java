package com.lifeline.hospital_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class HospitalService {
	
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplet;


	public String notifyKafka(String bloodgroup) {
		kafkaTemplet.send("lifelineTopic", bloodgroup);
		System.out.println("sent notification sucessfully");
		return "sent notification sucessfully";
	}

}
