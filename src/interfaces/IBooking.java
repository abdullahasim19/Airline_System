package interfaces;

import classes.Customer;
import classes.Flight;
import classes.Planes;
import classes.Trip;

public interface IBooking {
	public String getBookID();
	public void setBookID(String bookID);
	public String getUsername();
	public void setUsername(String username);
	public int getSeats();
	public void setSeats(int seats);
	public String getSeatsType() ;
	public void setSeatsType(String seatsType);
	public int getPackageID();
	public void setPackageID(int packageID);
	public int getTripID();
	public void setTripID(int tripID);
	public int getFlightID();
	public void setFlightID(int flightID);
	public String getBookingDate();
	public void setBookingDate(String bookingDate);
	public void bookTrip();
	public void cancelTrip();
	
	public void editTrip();
}
