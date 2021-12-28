package classes;

import java.sql.SQLException;

import javax.swing.JTable;

import gui.FrontPage;
import interfaces.IGUI;

public class GUI implements IGUI{
	
	public GUI()
	{
//		FrontPage fp=new FrontPage();
//		fp.setVisible(true);
	}
	
	// done signup button 
	public boolean signUpButton(Customer c) {
			
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
		
	// done user login button
	public boolean userLoginButton(Customer c) {
		
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
	
	// done admin login button
	public boolean adminLoginButton(Person p) {
			
			
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
	
	
	public void displayAllBookings(JTable table)
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

	@Override
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
	
}
