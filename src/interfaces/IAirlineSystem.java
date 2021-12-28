package interfaces;

import javax.swing.JTable;

public interface IAirlineSystem {
	public void login();
	
	public void signup();
	public void editUserDetail();
	public void bookingTrip();
	public void getAirportInfo();
	
	public void DisplayTrips(JTable table);
	public void viewHistory(String username, JTable table);
}
