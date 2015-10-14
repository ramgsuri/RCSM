package com.acme.message.handler;

import org.springframework.messaging.Message;

import com.fil.rcsm.model.jaxb.FlightInfo;

//import com.acme.model.jaxb.FlightInfo;

public class MessageHandler {
	
	String flag="Y";
	public Message<?>  receiveMessage(Message<?> message){
		
		System.out.println(" ---- The Message received via SFTP  is ---- "+message);
		Object obj = message.getPayload();
		System.out.println(" ---- The FlightNo is ---- "+((FlightInfo)obj).getFlightNo());
		System.out.println(" ---- The FlightModel is ---- "+((FlightInfo)obj).getFlightNo());
		FlightInfo flightObj =  (FlightInfo)obj;
		return message;
	}
	
	public Message<?>  handleEvent(Message<?> message) {
		System.out.println("---- Value -----"+message);
		return message;
	}
	
   public Message<?>  handleFCRS(Message<?> message) {
		System.out.println("---- Inside FCRS -----"+message);
		return message;
	}
	
    public Message<?>  handleCANS(Message<?> message) {
		System.out.println("---- Inside CANS -----"+message);
		return message;
	}
	
    public Message<?>  handleFLRS(Message<?> message) {
		System.out.println("---- Inside FLRS  -----"+message);
		return message;
	}
	
    public Message<?>  handleCRNS(Message<?> message) {
		System.out.println("---- Inside CRNS  -----"+message);
		return message;
	}
    
 	
}