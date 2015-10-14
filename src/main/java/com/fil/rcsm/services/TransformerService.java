package com.fil.rcsm.services;
//----------------------------------------------
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class TransformerService {
	
	public Message<?> transformService(Message<?> request) {
		
		System.out.println(" Hello ");
		return request;
		
	}
}
