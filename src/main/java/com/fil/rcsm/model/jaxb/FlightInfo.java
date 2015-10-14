package com.fil.rcsm.model.jaxb;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="FlightInfo")
public class FlightInfo  implements Serializable{
  
	/**
	 * 
	 */
	private static final long serialVersionUID = 2677768454685469445L;

	public FlightInfo(){
		super();
	}
	
	String flightNo;
	Long timestamp;
	String modelNo;
	
	@XmlElement(name="FlightNo")
	public String getFlightNo() {
		return flightNo;
	}
	
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
	
	@XmlElement(name="Timestamp")
	public Long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}
	
	@XmlElement(name="FlightModelNo")
	public String getModelNo() {
		return modelNo;
	}
	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}
	
}
