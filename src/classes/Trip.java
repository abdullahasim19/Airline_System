package classes;

import interfaces.ITrip;

public class Trip implements ITrip{
	
	private String departure;
	private String destination;
	private String tripName;
	private Planes plane=new Planes();
	private int tripId;
	
	public void getpickUpLocation() {
		
	}
	public void getDestinationLocation() {
		
	}
	public void stayDetails() {
	
	}
	public void facility() {
	
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripName() {
		return tripName;
	}
	public void setTripName(String tripName) {
		this.tripName = tripName;
	}
	public int getTripId() {
		return tripId;
	}
	public void setTripId(int tripId) {
		this.tripId = tripId;
	}
	public Planes getPlane() {
		return plane;
	}
	public void setPlane(Planes plane) {
		this.plane = plane;
	}
}
