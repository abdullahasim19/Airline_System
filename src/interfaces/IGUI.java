package interfaces;
import javax.swing.JTable;

import classes.Customer;
import classes.Person;
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
	

}
