package interfaces;

import javax.swing.JTable;

import classes.Airport;
import classes.Customer;
import classes.Person;
import classes.Planes;

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
	
	public void DisplayTrips(JTable table);
	public void viewHistory(String username, JTable table);
	public void fillPlaneTable(JTable table);
	
	public boolean removePlane(Planes p);
	public boolean addAirport(String aid, String country, String city);
	
	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap);
	
	public boolean addPrivatePlane(String planeId,String pname);
	
	public void fillAirportTable(JTable table,String country);
	
	public void fillPlaneTable(JTable table, String aid);
	
	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time);
}
