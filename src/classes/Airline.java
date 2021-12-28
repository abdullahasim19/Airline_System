package classes;

import java.sql.SQLException;


import javax.swing.JTable;

import interfaces.IAirlineSystem;
import interfaces.IAirportFunction;
import interfaces.IBookingFunction;
import interfaces.IEditDetails;
import interfaces.IRegistration;

public class Airline implements IEditDetails, IAirlineSystem, IRegistration, IBookingFunction, IAirportFunction{
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
	

	
	public void signup() {
		// TODO Auto-generated method stub
		
	}




}
