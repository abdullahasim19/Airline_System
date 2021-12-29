package classes;

import interfaces.IFlight;

public class Flight implements IFlight {
	
	private String flightid;
	private Planes plane = new Planes();
	private Airport airport= new Airport();
	private String date;
	private String Destination;
	private String time;
	


	public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public Planes getPlane() {
		return plane;
	}

	public void setPlane(Planes plane) {
		this.plane = plane;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String destination) {
		Destination = destination;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
	
	
}
