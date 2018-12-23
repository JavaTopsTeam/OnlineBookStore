
import java.sql.*;
public class DBConnection {
	private static Connection con;
	private DBConnection(){};
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3308/onlinebook","root","");
		}//End of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}//End of static block
	
	public static Connection getCon()
	{
		return con;
	}
}
