package com.lifeline.hospital_user_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import com.lifeline.hospital_user_service.model.BloodGroupRequest;
import com.lifeline.hospital_user_service.model.Location;

@Service
public class HospitalService {
	
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplet;


	public String notifyKafka(String bloodgroup) {
		kafkaTemplet.send("lifelineTopic", bloodgroup);
		System.out.println("sent notification sucessfully");
		return "sent notification sucessfully";
	}
	
	public void dummy() {
	// example usage of the record classes
	Location loc = new Location("City Hospital", "123 Main St", "Metropolis", "State", "Country");
	BloodGroupRequest req = new BloodGroupRequest("A+", loc);
	System.out.println("Constructed BloodGroupRequest: " + req);
	}

}
