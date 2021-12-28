package interfaces;

import javax.swing.JTable;

import classes.Customer;
import classes.Person;

public interface IAirlineSystem {
	public boolean AdminLogin(Person p);
	
	public boolean Customerlogin(Customer c);
	public boolean signup(Customer c);
	
	public void displayTrips(JTable table);
	public void displayAllCustomers(JTable table);
	public void displayAllBookigs(JTable table);
	public void editUserDetail();
	public void bookingTrip();
	public void getAirportInfo();
}
