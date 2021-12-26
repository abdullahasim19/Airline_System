package classes;

import interfaces.IBooking;

public class Booking implements IBooking{
	
	private Customer customer;
	private Planes plane;
	private int seatsCount;
	private String SeatsType;
	private Trip trip;
	private Package packages;
	private Flight flight;
	
	public void bookTrip() {
		
	}
	public void cancelTrip() {
		
	}
	
	public void editTrip() {
		
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Planes getPlane() {
		return plane;
	}
	public void setPlane(Planes plane) {
		this.plane = plane;
	}
	public int getSeatsCount() {
		return seatsCount;
	}
	public void setSeatsCount(int seatsCount) {
		this.seatsCount = seatsCount;
	}
	public String getSeatsType() {
		return SeatsType;
	}
	public void setSeatsType(String seatsType) {
		SeatsType = seatsType;
	}
	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public Package getPackages() {
		return packages;
	}
	public void setPackages(Package packages) {
		this.packages = packages;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
}
