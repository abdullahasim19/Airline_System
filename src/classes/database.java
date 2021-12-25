package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
	
	private Connection con;
	
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
	

	public Boolean signUp(Customer c) throws SQLException
	{
		String check = this.login((Person)c);
		
		if(check.equals("1"))
		{
			return false;
		}
		else
		{
			Statement st = con.createStatement(); 
			st.executeUpdate("inser into User values (\""+ c.getUsername() + "\", \"" + c.getPassword() +"\")");
	       
			st.executeUpdate("inser into Customer values (\""+ c.getUsername() + "\", \"" + c.getFullname() + "\", \""+ c.getGender() 
			+  "\", \""+ c.getDob() + "\", \""+  c.getContact() +"\", \"" + c.getAddress()  +"\");");
			
			return true;
			
		}
		
		//return null;
		
	}

}
