package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class database {
	
	private static Connection con;
	
	public  database() throws ClassNotFoundException
	{
		con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem?characterEncoding=latin1&useConfigs=maxPerformance","root","Panthom3813");
		}catch (SQLException e) {
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

	
	private String getCustomerName()
	{
		
		return null;
	}
	
	
	public void fillbookingTable(JTable table) throws SQLException
	{
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("Select * from Student");
		while(rs.next())
		{
			String id=rs.getString("stdId");
			String name = rs.getString("stdName");
			String Fname=rs.getString("FatherName");
			String gender=rs.getString("gender");
			String birthdate=rs.getString("birthdate");
			String phoneNo=rs.getString("phoneNo");
			String address=rs.getString("address");
           

			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(new Object[]{id,name,Fname,gender,birthdate,phoneNo,address});
		}
	}
	
	
}
