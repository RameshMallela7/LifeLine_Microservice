package com.lifeline.notification_service.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
	
	
	@KafkaListener(topics = "lifelineTopic", groupId = "my-group")
	public void notifyMessage(String message) {
		
		System.out.println("Reciver message : - "+ message);
		
	}

}
