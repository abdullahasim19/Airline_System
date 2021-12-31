package classes;

import java.sql.Date;
import java.sql.SQLException;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;

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
	private Flight flight=new Flight();
	private Captain captain=new Captain();
	private AssignCaptain cap=new AssignCaptain();

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
	
	
	public boolean addGeneralPlane(String planeId,String pname,int cap,int fclassCap, int businesClassCap,int econCap)
	{
		General pl=new General();
		
		pl.setPlaneID(Integer.valueOf(planeId));
		pl.setPlaneName(pname);
		pl.setTotalSeatsCount(cap);
		pl.setBusinessClass(businesClassCap);
		pl.setEconomicClass(econCap);
		pl.setFirstClass(fclassCap);
		
		try {
			database d=new database();
			d.AddGeneralPlane(pl);
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
	
	public boolean addPrivatePlane(String planeId,String pname)
	{
		Private pl=new Private();
		
		pl.setPlaneID(Integer.valueOf(planeId));
		pl.setPlaneName(pname);
		
		try {
			database d=new database();
			d.addPrivatePlane(pl);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return true;
	}
	
	
	public void signup() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void fillAirportTable(JTable table,String country)
	{
		try {
			database d=new database();
			d.fillAirportTable(table, country);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
	public int checkSeats(int s,int trip) {
		try {
			database d=new database();
			return d.checkSeats(s, trip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
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
	public void BookTrip(Booking obj) {
		try {
			database d=new database();
			d.BookTrip(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void fillPlaneTable(JTable table, String aid)
	{
		try {
			database d=new database();
			d.fillPlaneTable(table, aid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean AddFlight(String fid, String aid1, String aid2, String da, String dest, String time)
	{
		flight.getAirport().setAirportId(aid2);
		flight.getPlane().setPlaneID(Integer.valueOf(aid1));
		flight.setFlightid(fid);
		flight.setDate(da);
		flight.setDestination(dest);
		flight.setTime(time);
		
		try {
			database d=new database();
			d.AddFlight(flight);
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

	@Override
	public boolean addGeneralPlane(String planeId, String pname, String cap, String fclassCap, String businesClassCap,
			String econCap) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void viewDetails(JTextField username, JTextField fullname, JTextField gender, JTextField dob,
			JTextField contact, JTextField address,String ID) {
		try {
			database d=new database();
			d.viewDetails(username, fullname, gender, dob, contact, address, ID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void editDetails(String username, String fullname, String gender, String dob, String contact,
			String address) {
		database d;
		try {
			d = new database();
			d.editDetails(username, fullname, gender, dob, contact, address);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void ChangePassword(String oldPass, String newPass, String username) {
		database d;
		try {
			d = new database();
			d.ChangePassword(oldPass, newPass, username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public boolean addCaptain(String username, String name, String age,String gender)
	{
		captain.setAge(Integer.valueOf(age));
		captain.setUsername(username);
		captain.setGender(gender);
		captain.setCaptainname(name);
		try {
			database d=new database();
			d.addCaptain(captain);
			return true;
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public void fillCaptainTable(JTable table)
	{
		try {
			database d=new database();
			d.fillCaptainTable(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public boolean removeCaptain(String username, String captainID)
	{
		captain.setUsername(username);
		captain.setCaptainID(captainID);
		
		try {
			database d=new database();
			d.removeCaptain(captain);
			return true;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	
	public static void setCustomerDetails(Customer c)
	{
		try {
			database.setCustomerDetails(c);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateSeats(int newseats, int tripID) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPlaneCombo(JComboBox p,int tripID) {
		// TODO Auto-generated method stub
		database d;
		try {
			d = new database();
			d.setPlaneCombo(p, tripID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void showUserTrips(JComboBox trips,String username)
	{
		database d;
		try {
			d = new database();
			d.showUserTrips(trips, username);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void InsertFeedback(Feedback feedback)
	{
		database d;
		try {
			d = new database();
			d.InsertFeedback(feedback);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void planesForAiportTable(JTable table)
	{
		try {
			database d=new database();
			d.planesForAiportTable(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	
	public void fillAirportTableForTrip(JTable table)
	{
		try {
			database d=new database();
			d.fillAirportTableForTrip(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	
	public boolean addPlanetoairpot(String aid, int pid)
	{
		plane.getAirport().setAirportId(aid);
		plane.setPlaneID(pid);
		try {
			database d=new database();
			return d.addPlanetoairpot(plane);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return false;
	}

	
	
	public void fillTableForAssignCaptain(JTable table)
	{
		try {
			database d=new database();
			d.fillTableForAssignCaptain(table);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void fillCaptainComboBox(JComboBox box)
	{
		try {
			database d=new database();
			d.fillCaptainComboBox(box);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public boolean AssignCaptain(String capid, String flightid)
	{
		cap.getCaptain().setCaptainname(capid);
		cap.getFlight().setFlightid(flightid);
		try {
			database d=new database();
			return d.AssignCaptain(cap);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return false;

	}
}
