package classes;

import java.sql.Date;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

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
	
	
	public void fillPlaneTable(JTable table)
	{
		this.arlineSystem.fillPlaneTable(table);
	}
	
	public boolean addAirportButton(String aid, String country, String city)
	{
		return this.arlineSystem.addAirport(aid,country,city);
	}

	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap)
	{
		
		System.out.println(planeId);
		
		System.out.println(cap);
		System.out.println(fclassCap);
		System.out.println(businesClassCap);
		System.out.println(econCap);
		
		return this.arlineSystem.addGeneralPlane(planeId, pname, cap, fclassCap, businesClassCap, econCap);
		
	}
	
	
	public boolean addPrivatePlane(String planeId,String pname)
	{
		return this.arlineSystem.addPrivatePlane(planeId, pname);
	}
	
	public boolean removePlane(Planes p)
	{
		return this.arlineSystem.removePlane(p);
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

	
	public void fillAirportTable(JTable table,String country)
	{
		this.arlineSystem.fillAirportTable(table, country);
	}


	
	public void displayTrips(JTable table) {
		try {
			Airline d=new Airline();
			d.DisplayTrips(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void viewHistory(String username, JTable table) {
		try {
			Airline d=new Airline();
			d.viewHistory(username, table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void OpenFrontPage() {
		// TODO Auto-generated method stub
		FrontPage fp=new FrontPage();
		fp.setVisible(true);
	}

	@Override
	public void viewProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setComboBoxes(JComboBox tripid) {
		Airline a= new Airline();
		a.setComboBoxes(tripid);
	}

	@Override
	public boolean checkSeats(int s,int trip) {
		Airline a = new Airline();
		return a.checkSeats(s, trip);
		
	}

	@Override
	public int getFlightID(int plane) {
		Airline a =new Airline();
		return a.getFlightID(plane);
	}
	public void BookTrip(String bookingID,String username,int seats,String seatType,int packageID,int tripID,int flightID,String bookingdate,String time)
	{
		
		Airline a=new Airline();
		a.BookTrip(bookingID, username, seats, seatType, tripID,packageID, flightID, bookingdate, time);
		
	}

	
	public void fillPlaneTable(JTable table, String aid)
	{
		this.arlineSystem.fillPlaneTable(table, aid);
	}
	

	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time)
	{
		return this.arlineSystem.AddFlight(fid, aid1, aid2, da, dest, time);
		 
	}

	@Override
	public boolean addGeneralPlane(String planeId, String pname, String cap, String fclassCap, String businesClassCap,
			String econCap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void viewDetails(JTextField username, JTextField fullname, JTextField gender, JTextField dob,
			JTextField contact, JTextField address,String ID) {
		Airline a=new Airline();
		a.viewDetails(username, fullname, gender, dob, contact, address, ID);
		
	}

	@Override
	public void editDetails(String username, String fullname, String gender, String dob, String contact,
			String address) {
		Airline a=new Airline();
		a.editDetails(username, fullname, gender, dob, contact, address);
		
	}

	@Override
	public void ChangePassword(String oldPass, String newPass, String username) {
		Airline a=new Airline();
		a.ChangePassword(oldPass, newPass, username);
		
	}

}
