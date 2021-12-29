package interfaces;

import java.sql.Date;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

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
	public void setComboBoxes(JComboBox tripid);
	public boolean checkSeats(int s,int trip);
	public int getFlightID(int planeid);
	public void BookTrip(String bookingID,String username,int seats,String seatType,int packageID,int tripID,int flightID,String bookingdate,String time);
	public void viewDetails(JTextField username, JTextField fullname,JTextField gender,JTextField dob,JTextField contact,JTextField address,String ID);
	public void editDetails(String username, String fullname,String gender,String dob,String contact,String address);
	public void ChangePassword(String oldPass,String newPass,String username);
}
