package interfaces;

import java.sql.Date;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

import classes.Booking;
import classes.Feedback;
import classes.Trip;

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
	public int checkSeats(int s,int trip);
	public int getFlightID(int planeid);
	public void BookTrip(Booking obj);
	public void viewDetails(JTextField username, JTextField fullname,JTextField gender,JTextField dob,JTextField contact,JTextField address,String ID);
	public void editDetails(String username, String fullname,String gender,String dob,String contact,String address);
	public void ChangePassword(String oldPass,String newPass,String username);
	public void updateSeats(int newseats,int tripID);
	public void setPlaneCombo(JComboBox p,int tripID);
	public void AddHistory(String username,int tripID);
	public void showUserTrips(JComboBox trips,String username);
	public void InsertFeedback(Feedback feedback);

	public void ShowPackages(JComboBox packages);

	public void fillFlightTable(JTable table)throws SQLException;
	public boolean MergeFlighttoTrip(Trip trip, String type)throws SQLException;
	public int getPlaneID(String fid) throws SQLException;

}
