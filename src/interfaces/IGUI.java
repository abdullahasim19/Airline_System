package interfaces;
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
}
