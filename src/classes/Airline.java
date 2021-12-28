package classes;

import javax.swing.JTable;

import interfaces.IAirlineSystem;
import interfaces.IAirportFunction;
import interfaces.IBookingFunction;
import interfaces.IEditDetails;
import interfaces.IRegistration;

public class Airline implements IEditDetails, IAirlineSystem, IRegistration, IBookingFunction, IAirportFunction{
	public void login() {
		
	}
	
	public void signup() {
		
	}
	public void editUserDetail() {
		
	}
	public void bookingTrip() {
		
	}
	public void getAirportInfo() {
		
	}

	@Override
	public void viewHistory(String username, JTable table) {
		try {
			database d=new database();
			d.viewHistory(username, table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void DisplayTrips(JTable table) {
		try {
			database d=new database();
			d.DisplayTrips(table);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
}
