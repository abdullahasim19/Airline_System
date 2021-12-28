package classes;
import java.sql.*;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import interfaces.IDatabase;

public class database implements IDatabase{
	
	private static Connection con;
	
	public  database() throws ClassNotFoundException
	{
		con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String login(Person p) throws SQLException
	{
		String log=null;
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) as done from User where"
				+ " username=\"" + p.getUsername() + "\" and password=\"" + p.getPassword() + "\";" );
		
		
		if(rs.next())
		{
			log = rs.getString("done");
		}
		
		//System.out.println(log);
		return log;
		
	}
	

	public void signUp(Customer c) throws SQLException
	{
		
			Statement st = con.createStatement(); 
			st.executeUpdate("insert into User values (\""+ c.getUsername() + "\", \"" + c.getPassword() +"\")");
	       
			st.executeUpdate("insert into Customer values (\""+ c.getUsername() + "\", \"" + c.getFullname() + "\", \""+ c.getGender() 
			+  "\", \""+ c.getDob() + "\", \""+  c.getContact() +"\", \"" + c.getAddress()  +"\");");
			
			
		
		//return null;
		
	}
	
	
	public static void setCustomerDetails(Customer c) throws SQLException
	{
		
		Statement st = con.createStatement();
		
		ResultSet rs=st.executeQuery("select c.fullName, c.Gender, c.dob, c.contact, c.address from"
				+ " User u join Customer c on u.username=c.username "
				+ "where" + " u.username=\"" + c.getUsername() + "\" and u.password=\"" + c.getPassword() + "\";");
		
		if(rs.next())
		{
			 c.setFullname(rs.getString("c.fullName"));
			 c.setGender(rs.getString("c.Gender"));
			 c.setContact(rs.getString("c.contact"));
			 c.setAddress(rs.getString("c.address"));
			 c.setDob(rs.getString("c.dob"));
		}
		
		
		
	}
	
	public void fillbookingTable(JTable table) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select b.bookingID, c.fullName,ar.country ,f.destination, pp.packageID, b.seatsCount, f.flightdate  from Booking b join Customer c on b.username=c.username join Plane p on p.planeID=b.planeID\r\n"
				+ "join Airport ar on ar.airportID=p.airportID join Packages pp on pp.packageID=b.packageID \r\n"
				+ "join Trip t on t.tripID=b.tripID join Flight f on f.flightID=b.flightID; ");
		
		
		
		
		while(rs.next())
		{
			
			String id=rs.getString("b.bookingID");
			String fn=rs.getString("c.fullName");
			String country=rs.getString("ar.country");
			String dest=rs.getString("f.destination");
			String pid=rs.getString("pp.packageID");
			String sc=rs.getString("b.seatsCount");
			String fd=rs.getString("f.flightdate");
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{id,fn,country,dest,pid,sc,fd});
		}
	}
	public void DisplayTrips(JTable table)
	{
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
			Statement st=connection.createStatement();
			PreparedStatement ps=connection.prepareStatement("select Trip.tripID,Trip.departure,"
					+ "Flight.destination,Flight.flightTime,Flight.flightDate,Trip.availableseats "
					+ "from Trip join Flight on Trip.planeID=Flight.planeID;");
			
			//ResultSet rs=st.executeQuery("select *from User");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				String tripID=String.valueOf(rs.getInt("tripID"));
				String departure=rs.getString("departure");
				String destination=rs.getString("destination");
				String ftime=rs.getTime("flightTime").toString();
				String fdate=rs.getDate("flightDate").toString();
				String seats=String.valueOf(rs.getInt("availableseats"));
				
				String []arr= {tripID,departure,destination,ftime,fdate,seats};
				DefaultTableModel tb=(DefaultTableModel)table.getModel();
				tb.addRow(arr);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void storeBookingTripDetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeFlightTimingInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeEditPlaneTime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addUserInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editUserInfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifyCredential() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkValidity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayTrips() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void viewHistory(String username, JTable table) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
			Statement st=connection.createStatement();
			PreparedStatement ps=connection.prepareStatement("select Customer.fullname,Trip.departure,Trip.destination from Customer join History on Customer.username=History.username join Trip on History.tripID=Trip.tripID where History.username=?");
			ps.setString(1, username);
			
			//ResultSet rs=st.executeQuery("select *from User");
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				String name=rs.getString("fullname");
				String departure=rs.getString("departure");
				String destination=rs.getString("destination");
				String []arr= {name,departure,destination};
				DefaultTableModel tb=(DefaultTableModel)table.getModel();
				tb.addRow(arr);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
	
}
