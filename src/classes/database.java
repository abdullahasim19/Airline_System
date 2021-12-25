package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
	
	
}
