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
		this.arlineSystem.setComboBoxes(tripid);
	}

	@Override
	public int checkSeats(int s,int trip) {
		return this.arlineSystem.checkSeats(s, trip);
		
	}

	@Override
	public int getFlightID(int plane) {
		return this.arlineSystem.getFlightID(plane);
	}
	public void BookTrip(Booking obj)
	{
		
		this.arlineSystem.BookTrip(obj);
		
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
		this.arlineSystem.viewDetails(username, fullname, gender, dob, contact, address, ID);
		
	}

	@Override
	public void editDetails(String username, String fullname, String gender, String dob, String contact,
			String address) {
		this.arlineSystem.editDetails(username, fullname, gender, dob, contact, address);
		
	}

	@Override
	public void ChangePassword(String oldPass, String newPass, String username) {
		this.arlineSystem.ChangePassword(oldPass, newPass, username);
		
	}
	
	
	public boolean addCaptain(String username, String name, String age,String gender)
	{
		return this.arlineSystem.addCaptain(username, name, age, gender);
	}
	
	public void fillCaptainTable(JTable table)
	{
		this.arlineSystem.fillCaptainTable(table);
	}
	
	public boolean removeCaptain(String username, String captainID)
	{
		return this.arlineSystem.removeCaptain(username, captainID);
	}

	@Override
	public void updateSeats(int newseats, int tripID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaneCombo(JComboBox p,int tripID) {
		Airline a=new Airline();
		a.setPlaneCombo(p, tripID);
		
	}
	public void showUserTrips(JComboBox trips,String username)
	{
		Airline a=new Airline();
		a.showUserTrips(trips, username);
	}
	public void InsertFeedback(Feedback feedback)
	{
		Airline a=new Airline();
		a.InsertFeedback(feedback);
	}
	
	public static void setCustomerDetails(Customer c)
	{
		Airline.setCustomerDetails(c);
	}
	
	public void planesForAiportTable(JTable table)
	{
		this.arlineSystem.planesForAiportTable(table);
	}
	
	public void fillAirportTableForTrip(JTable table)
	{
		this.arlineSystem.fillAirportTableForTrip(table);
	}
	
	public boolean addPlanetoairpot(String aid, int pid)
	{
		return this.arlineSystem.addPlanetoairpot(aid, pid);
	}
	
	
	public void fillTableForAssignCaptain(JTable table)
	{
		this.arlineSystem.fillTableForAssignCaptain(table);
	}

	@SuppressWarnings("rawtypes")
	public void fillCaptainComboBox(JComboBox box)
	{
		this.arlineSystem.fillCaptainComboBox(box);
	}
	
	public boolean AssignCaptain(String capid, String flightid)
	{
		//System.out.println(flightid);
		return this.arlineSystem.AssignCaptain(capid,flightid);
	}
	
	public void fillFlightTable(JTable table)
	{
		this.arlineSystem.fillFlightTable(table);
	}
	
	public boolean MergeFlighttoTrip(String tripName, int fid, String sOrR, String dep, String dest)
	{
		return this.arlineSystem.MergeFlighttoTrip(tripName, fid, sOrR,dep,dest);
	}
	public int getPlaneID(String fid)
	{
		return this.arlineSystem.getPlaneID(fid);
	}

}



