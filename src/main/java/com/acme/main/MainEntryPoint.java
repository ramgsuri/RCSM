package com.acme.main;
//------------------------------------------------------------------------------
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fil.rcsm.eventing.FlightLandedEvent;
//------------------------------------------------------------------------------
public class MainEntryPoint {
	
	public static void main(String args[]){
		
		final AbstractXmlApplicationContext app = new 
					ClassPathXmlApplicationContext("/META-INF/spring/sftpContext.xml");
		FlightLandedEvent flightLandedEvent = new FlightLandedEvent(app,"Airbus","AA101");
		System.out.println(" ---- Publish Event ---- ");
		app.publishEvent(flightLandedEvent);
		app.registerShutdownHook();
		app.start();
		
	}
	
}