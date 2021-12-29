package classes;

import java.sql.Date;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTable;

import interfaces.IAirlineSystem;
import interfaces.IAirportFunction;
import interfaces.IBookingFunction;
import interfaces.IEditDetails;
import interfaces.IRegistration;

public class Airline implements IEditDetails, IAirlineSystem, IRegistration, IBookingFunction, IAirportFunction{
	private Airport airport=new Airport();
	private Booking booking= new Booking();
	private Planes plane = new Planes();
	//private Package packag = new Package();
	private Customer customer = new Customer();
	//private Trip trip = new Trip();

	public boolean AdminLogin(Person p)
	{
		try {
			database d=new database();
			
			String b = d.login(p);
			
			if(b.equals("1"))
			{
				
				//frame.dispose();
				return true;
			}
			else
			{
				
				return false;
			}
			
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
			return false;
		} catch (SQLException e1) {
			
			e1.printStackTrace();
			return false;
		} 
	}
	
	public boolean Customerlogin(Customer c) {
	
		try {
			database d=new database();
			
			String b = d.login((Person)c);
			
			if(b.equals("1"))
			{
				
				//frame.dispose();
				return true;
			}
			else
			{
				
				return false;
			}
			
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
			return false;
		} catch (SQLException e1) {
			
			e1.printStackTrace();
			return false;
		}
		
	}
	
	public boolean signup(Customer c) {
		
		
		try {
			database db=new database();
			
			db.signUp(c);
		
			return true;
			
			
		} catch (ClassNotFoundException e1) {
			
			
			e1.printStackTrace();
		} catch (SQLException e1) {
			
			
			
			e1.printStackTrace();
		} 
		
		return false;
		
	}
	
	public void displayAllBookigs(JTable table)
	{
		try {
			database d=new database();
			d.fillbookingTable(table);
			
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
			
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		} 
	}

	public void displayTrips(JTable table) {
		try {
			database d=new database();
			d.DisplayTrips(table);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void displayAllCustomers(JTable table) {
		try {
			database d=new database();
			d.fillCustomerTable(table);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void editUserDetail() {
		
	}
	public void bookingTrip() {
		
	}
	public void getAirportInfo() {
		
	}
	
	public void fillPlaneTable(JTable table)
	{
		try {
			database d=new database();
			d.fillPlaneTable(table);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

	
	public boolean removePlane(Planes p)
	{
		try {
			database d=new database();
			d.removePlane(p);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	

	public boolean addAirport(String aid, String country, String city)
	{
		airport.setAirportId(aid);
		airport.setCountry(country);
		airport.setCity(city);
		
		try {
			database d=new database();
			d.addAirport(airport);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	public boolean addGeneralPlane(String planeId,String pname,String cap,String fclassCap, String businesClassCap,String econCap)
	{
		return true;
	}
	
	public void signup() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setComboBoxes(JComboBox tripid) {
		database d;
		try {
			d = new database();
			d.setComboBoxes(tripid);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean checkSeats(int s,int trip) {
		try {
			database d=new database();
			return d.checkSeats(s, trip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public int getFlightID(int plane) {
		try {
			database d=new database();
			return d.getFlightID(plane);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
	}

	@Override
	public void BookTrip(String bookingID, String username, int seats, String seatType, int packageID,int tripID, int flightID,
			String bookingdate, String time) {
		try {
			database d=new database();
			d.BookTrip(bookingID, username, seats, seatType, tripID,packageID, flightID, bookingdate, time);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




}
