package interfaces;

import classes.Customer;
import classes.Flight;
import classes.Planes;
import classes.Trip;

public interface IBooking {
	public void bookTrip();
	public void cancelTrip();
	
	public void editTrip();
	
	public Customer getCustomer();
	public void setCustomer(Customer customer);
	public Planes getPlane();
	public void setPlane(Planes plane);
	public int getSeatsCount();
	public void setSeatsCount(int seatsCount);
	public String getSeatsType() ;
	public void setSeatsType(String seatsType);
	public Trip getTrip();
	public void setTrip(Trip trip) ;
	public Package getPackages() ;
	public void setPackages(Package packages);
	public Flight getFlight();
	public void setFlight(Flight flight);
}
