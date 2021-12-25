package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class database {
	
	@SuppressWarnings("unused")
	private Connection con;
	
	public  database() throws ClassNotFoundException
	{
		con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/airlinesystem","root","Panthom3813");
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Boolean login(Person p) throws SQLException
	{
		boolean log =false;
		Statement st = con.createStatement();
		ResultSet rs=st.executeQuery("select count(*) as done from Admin a join User u on a.username=u.username where"
				+ " a.username=\"" + p.getUsername() + "\" and u.password=\"" + p.getPassword() + "\";" );
		if(rs.next())
		{
			log = rs.getBoolean("done");
		}
		
		return log;
		
	}
	
}
