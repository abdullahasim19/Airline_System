package interfaces;
import javax.swing.JTable;

import classes.Customer;
import classes.Person;
import classes.Planes;
public interface IGUI {
public boolean userLoginButton(Customer c);
	public boolean signUpButton(Customer c) ;
	public void viewAllCustomers();
	public boolean adminLoginButton(Person p) ;
	public void viewAllBookings() ;
	public void addPackage();
	public void addPlanes() ;
	public void selectPaymentMethod();
	public void confirmBookingButton();
	public void displayBookingButton() ;
	public void displayError() ;
	public void editUserDetailButton();
	public void editTripDetailButton() ;
	public void displayAllBookings(JTable table);
	public void displayTrips(JTable table);

	public void viewHistory(String username, JTable table);

	public void OpenFrontPage();
	
	public void displayAllCustomers(JTable table);
	
	public boolean removePlane(Planes p);
	public boolean addAirportButton(String aid, String country, String city);
	
	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap);
	public boolean addPrivatePlane(String planeId,String pname);
	public void fillAirportTable(JTable table,String country);
	public void fillPlaneTable(JTable table, String aid);
	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time);
}
