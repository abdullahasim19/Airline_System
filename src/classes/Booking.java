package classes;

import interfaces.IBooking;

public class Booking implements IBooking{
	
	private String bookID;
	private String username;
	private int seats;
	private String seatsType;
	private int packageID;
	private int tripID;
	private int flightID;
	private String bookingDate;
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getSeats() {
		return seats;
	}
	public Booking()
	{
		
	}
	public Booking(String bookID, String username, int seats, String seatsType, int packageID, int tripID, int flightID,
			String bookingDate) {
		super();
		this.bookID = bookID;
		this.username = username;
		this.seats = seats;
		this.seatsType = seatsType;
		this.packageID = packageID;
		this.tripID = tripID;
		this.flightID = flightID;
		this.bookingDate = bookingDate;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public String getSeatsType() {
		return seatsType;
	}
	public void setSeatsType(String seatsType) {
		this.seatsType = seatsType;
	}
	public int getPackageID() {
		return packageID;
	}
	public void setPackageID(int packageID) {
		this.packageID = packageID;
	}
	public int getTripID() {
		return tripID;
	}
	public void setTripID(int tripID) {
		this.tripID = tripID;
	}
	public int getFlightID() {
		return flightID;
	}
	public void setFlightID(int flightID) {
		this.flightID = flightID;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public void bookTrip() {
		
	}
	public void cancelTrip() {
		
	}
	
	public void editTrip() {
		
	}
	
	
	
	
}
