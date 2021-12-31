package interfaces;
import java.sql.Date;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

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

	public void viewProfile();

	public void setComboBoxes(JComboBox tripid);
	
	public boolean addAirportButton(String aid, String country, String city);
	

	public boolean addGeneralPlane(String planeId,String pname,String cap,String fclassCap, String businesClassCap,String econCap);
	
	public boolean checkSeats(int s,int trip);
	public int getFlightID(int plane);
	public void BookTrip(String bookingID,String username,int seats,String seatType,int packageID,int tripID,int flightID,String bookingdate,String time);

	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap);
	public boolean addPrivatePlane(String planeId,String pname);
	public void fillAirportTable(JTable table,String country);
	public void fillPlaneTable(JTable table, String aid);
	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time);
	public void viewDetails(JTextField username, JTextField fullname,JTextField gender,JTextField dob,JTextField contact,JTextField address,String ID);
	public void editDetails(String username, String fullname,String gender,String dob,String contact,String address);
	public void ChangePassword(String oldPass,String newPass,String username);
	
	public boolean addCaptain(String username, String name, String age,String gender);
	public void fillCaptainTable(JTable table);
	
	public boolean removeCaptain(String username, String captainID);
	public static void setCustomerDetails(Customer c) {
	}
}
