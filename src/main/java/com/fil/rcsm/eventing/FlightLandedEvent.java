package com.fil.rcsm.eventing;

import org.springframework.context.ApplicationEvent;

public class FlightLandedEvent extends ApplicationEvent {
	
	String flightNo;
	String flightModelNo;
	
	public FlightLandedEvent(Object source) {
		super(source);
	}
	
	public FlightLandedEvent(Object source, String flightModelNo, String flightNo) {
		super(source);
		this.flightModelNo = flightModelNo;
		this.flightNo=flightNo;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -8768187530659626502L;

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getFlightModelNo() {
		return flightModelNo;
	}

	public void setFlightModelNo(String flightModelNo) {
		this.flightModelNo = flightModelNo;
	}

}
