package com.fil.rcsm.eventing;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class FlightLandedListener implements ApplicationListener<FlightLandedEvent>{

	public void onApplicationEvent(FlightLandedEvent applicationEvent) {
		
		System.out.println("---- Received application event ::::: ----");
		FlightLandedEvent flightLandedEvent =  (FlightLandedEvent)applicationEvent;
		System.out.println("---- Received eventFlight Model No ----"+flightLandedEvent.getFlightModelNo());
		System.out.println("---- Received event Flight No ----"+flightLandedEvent.getFlightNo());
		
	}

}
