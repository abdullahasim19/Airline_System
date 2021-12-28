package interfaces;

import javax.swing.JTable;

public interface IDatabase {
	public void storeBookingTripDetails();
	public void verifyInfo();
	public void storeFlightTimingInfo();
	public void storeEditPlaneTime();
	public void addUserInfo();
	public void editUserInfo();
	public void verifyCredential();
	public void checkValidity();
	public void displayTrips();
	public void viewHistory(String username, JTable table);
}
