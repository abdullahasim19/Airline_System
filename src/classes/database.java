package classes;
import java.awt.Color;
import java.sql.*;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
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
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld"); // for abdullah
			//con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "Panthom3813");// for rasaal
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
		ResultSet rs=st.executeQuery("select b.bookingID, c.fullName,ar.country ,f.destination, pp.packageID, b.seatsCount, f.flightdate  from Booking b \r\n"
				+ "join Customer c on b.username=c.username  \r\n"
				+ "left join Packages pp on pp.packageID=b.packageID  \r\n"
				+ "left join Trip t on t.tripID=b.tripID \r\n"
				+ "join Flight f on f.flightID=b.flightID\r\n"
				+ "join Airport ar on ar.airportID=f.airportID;");
		
		
		
		
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
		
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("select Trip.tripID,Trip.departure,"
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
	
	public void fillPlaneTable(JTable table) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Plane p left join Airport a on a.airportID=p.airportID");
		
		while(rs.next())
		{
			
			String id=rs.getString("planeID");
			String fn=rs.getString("planeName");
			String aid=rs.getString("airportID");
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{id,fn,aid});
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
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("select Customer.fullname,Trip.departure,Trip.destination from Customer join History on Customer.username=History.username join Trip on History.tripID=Trip.tripID where History.username=?");
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
	public boolean checkSeats(int s,int trip) {
		
		
		try {
			PreparedStatement ps=con.prepareStatement("select availableseats from Trip where tripID= ?");
			ps.setInt(1, trip);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
			int check=rs.getInt("availableseats");
			//System.out.print(check);
			if(check-s>0)
				return true;
			}
			return false;
			
		} catch (Exception e1) {
			e1.printStackTrace();
			return false;
		}
		
	}
	
	public int getFlightID(int planeid) {
		
		try {
			PreparedStatement pp=con.prepareStatement("select planeID from Trip where tripID= ? ");
			pp.setInt(1, planeid);
			ResultSet rs1=pp.executeQuery();
			int pid=0;
			if(rs1.next())
				pid=rs1.getInt("planeID");
			
			PreparedStatement ps=con.prepareStatement("select flightID from Flight join Trip on Flight.planeID=Trip.planeID where Trip.planeID= ?;");
			ps.setInt(1, pid);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				int ID=rs.getInt("flightID");
				return ID;
			}
			return -1;
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return -1;
		}
	
	}
	
	@Override
	public void setComboBoxes(JComboBox tripid) {
		// TODO Auto-generated method stub
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem", "root", "helloworld");
			Statement st=con.createStatement();
			PreparedStatement ps=con.prepareStatement("select Trip.tripID from Trip join Flight on Trip.planeID=Flight.planeID;");
			
			
			//ResultSet rs=st.executeQuery("select *from User");
			ResultSet rs=ps.executeQuery();
			int i=0;
			while(rs.next())
			{
				

				int ID=rs.getInt("tripID");
				tripid.insertItemAt(ID, i);
				
				i++;
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public void fillCustomerTable(JTable table) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Customer");
		
		while(rs.next())
		{
			
			String usr=rs.getString("username");
			String fn=rs.getString("fullName");
			String gender=rs.getString("Gender");
			String dob=rs.getString("dob");
			String cont=rs.getString("contact");
			String adr=rs.getString("address");
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{usr,fn,gender,dob,cont,adr});
		}
	}
	
	
	public void addAirport(Airport a) throws SQLException
	{
		Statement st = con.createStatement(); 
		st.executeUpdate("insert into Airport values(\"" + a.getAirportId() + "\", \""+ a.getCountry()  +"\", \""+ a.getCity() +"\");");
	}
	
	public void removePlane(Planes p) throws SQLException
	{
		Statement st = con.createStatement(); 
		st.executeUpdate("delete from Plane where planeID="+ p.getPlaneID() + ";");
		
		//System.out.println("delete from Plane where planeID="+ String.valueOf(p.getPlaneID()) + ";");
		
	}
	
	
	public void AddGeneralPlane(General p)throws SQLException
	{
		Statement st = con.createStatement(); 
		st.executeUpdate("insert into Plane values (" + p.getPlaneID()+ ",\""+  p.getPlaneName() +"\", null );");
		st.executeUpdate("insert into GeneralPlane values (" + p.getPlaneID()  + ", "+ p.getTotalSeatsCount()  + ","+ p.getBusinessClass() +","+ p.getEconomicClass() + ","+ p.getFirstClass() +");");
	}

	
	

	public void BookTrip(String bookingID,String username,int seats,String seatType,int packageID,int tripID,int flightID,String bookingdate,String time)
	{
		
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into Booking values(?,?,?,?,?,?,?,?,?);");
			ps.setString(1, bookingID);
			ps.setString(2,username);
			ps.setInt(3, seats);
			ps.setString(4, seatType);
			ps.setInt(5, packageID);
			ps.setInt(6, tripID);
			ps.setInt(7, flightID);
			ps.setString(8, bookingdate);
			ps.setString(9, time);
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}
	

	
	
	
	public void addPrivatePlane(Private p) throws SQLException
	{
		Statement st = con.createStatement(); 
		st.executeUpdate("insert into Plane values (" + p.getPlaneID()+ ",\""+  p.getPlaneName() +"\", null );");
		st.executeUpdate("insert into PrivatePlane values (" + p.getPlaneID() + ");");
	}
	
	
	
	
	public void fillAirportTable(JTable table, String coun) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Airport where country=\"" + coun +"\";");
		
		while(rs.next())
		{
			
			String id=rs.getString("airportID");
			String country =rs.getString("country");
			String city=rs.getString("city");

			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{id,country,city});
		}
	}
	
	
	public void fillPlaneTable(JTable table, String aid) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Plane p join Airport a on a.airportID=p.airportID  where p.airportID=\"" + aid +"\";");
		
		while(rs.next())
		{
			
			String id=rs.getString("planeID");
			String fn=rs.getString("planeName");
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{id,fn});
		}
	}
	
	
	public void AddFlight(Flight  f) throws SQLException
	{
		Statement st = con.createStatement(); 
		
		st.executeUpdate("insert into Flight values (\"" + f.getFlightid() + "\","+ f.getPlane().getPlaneID()  + ",\""+ 
		f.getAirport().getAirportId()  +"\",\""+ f.getDate()  + "\", \""+ f.getDestination() +"\", \""+f.getTime()  +"\");");
	}

	@Override
	public void viewDetails(JTextField username, JTextField fullname, JTextField gender, JTextField dob,
			JTextField contact, JTextField address,String ID) {
		try {
			PreparedStatement ps=con.prepareStatement("select * from Customer where username= ? ");
			ps.setString(1, ID);
			
			
			
			
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				username.setEnabled(true);
				username.setText(rs.getString("username"));
			
				fullname.setEnabled(true);
				fullname.setText(rs.getString("fullName"));
				gender.setEnabled(true);
				gender.setText(rs.getString("Gender"));
				dob.setEnabled(true);
				dob.setText((rs.getDate("dob").toString()));
				contact.setEnabled(true);
				contact.setText(rs.getString("contact"));
				address.setEnabled(true);
				address.setText(rs.getString("address"));
			}
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
	}

	@Override
	public void editDetails(String username, String fullname, String gender, String dob, String contact,
			String address) {
		
		try {
			
			PreparedStatement ps=con.prepareStatement("update Customer set fullName=? , Gender=?, dob=?, contact=?, address=? where username=? ");
			ps.setString(1, fullname);
			ps.setString(2, gender);
			ps.setString(3, dob);
			ps.setString(4, contact);
			ps.setString(5, address);
			ps.setString(6, username);
			
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}

	@Override
	public void ChangePassword(String oldPass, String newPass, String username) {
		try {
			
			PreparedStatement ps=con.prepareStatement("update User set password=? where username=? ");
			ps.setString(1, newPass);
			ps.setString(2, username);
			
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
		
	}
	
	
	public void addCaptain(Captain captain) throws SQLException
	{
		Statement st = con.createStatement(); 
		st.executeUpdate("insert into User values (\""+ captain.getUsername() + "\", null)");
		
		int min = 10;
	    int max = 1000000;
	        
	    int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		
	    String capid="Cap-00"+Integer.toString(random_int);
	    
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into Captain values(?,?,?,?,?);");
			ps.setString(1, capid);
			ps.setString(2,captain.getUsername());
			ps.setString(3, captain.getCaptainname());
			ps.setInt(4, captain.getAge());
			ps.setString(5, captain.getGender());
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}
	
	
	
	public void removeCaptain(Captain captain)
	{
		try {
			
			PreparedStatement ps=con.prepareStatement("delete from Captain where captainId=? and username=?");
			ps.setString(1, captain.getCaptainID());
			ps.setString(2, captain.getUsername());
			
			int x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
			ps=con.prepareStatement("delete from User where username=?");
			ps.setString(1, captain.getUsername());
			x=ps.executeUpdate();
			if(x>0)
				System.out.println("Done");
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			
		}
	}
	
	
	public void fillCaptainTable(JTable table)throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select * from Captain");
		
		while(rs.next())
		{
			
			String capid=rs.getString("captainId");
			String usr=rs.getString("username");
			String name=rs.getString("CaptainName");
			String age=rs.getString("age");
			String gender=rs.getString("gender");
			
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{capid,usr,name,age,gender});
		}
		
	}
	
}
