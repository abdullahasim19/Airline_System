package classes;

import javax.swing.JTable;

import gui.FrontPage;
import interfaces.IGUI;

public class GUI implements IGUI{
	
	private Airline arlineSystem=new Airline();
	
	public GUI()
	{

	}
	
	// done signup button 
	public boolean signUpButton(Customer c) {
			return this.arlineSystem.signup(c);
		}
		
	// done user login button
	public boolean userLoginButton(Customer c) {
			return this.arlineSystem.Customerlogin(c);
	}
	
	// done admin login button
	public boolean adminLoginButton(Person p) {
			
		return this.arlineSystem.AdminLogin(p);
		
	}
	
	// done
	public void displayAllBookings(JTable table)
	{
		this.arlineSystem.displayAllBookigs(table);
	}
	
	
	public void displayAllCustomers(JTable table) {
		
		this.arlineSystem.displayAllCustomers(table);
		
	}
	
	@Override
	public void displayTrips(JTable table) {
		this.arlineSystem.displayTrips(table);
		
	}

	
	
	public void viewAllCustomers() {
		
	}
	
	
	
	public void viewAllBookings() {
		
	}
	public void addPackage() {
		
	}
	public void addPlanes() {
		
	}
	public void selectPaymentMethod() {
		
	}
	public void confirmBookingButton() {
		
	}
	public void displayBookingButton() {
		
	}
	public void displayError() {
		
	}
	public void editUserDetailButton() {
		
	}
	public void editTripDetailButton() {
		
	}



	@Override
	public void OpenFrontPage() {
		// TODO Auto-generated method stub
		FrontPage fp=new FrontPage();
		fp.setVisible(true);
	}
	
}
