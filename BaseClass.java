import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.*;
import java.awt.*;
public class BaseClass extends JFrame 
{
	static ResultSet rs=null;
	static Statement stmt=null;
	static Connection con=null;
	BaseClass()
	{
		 try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/wholesale","root","");
			stmt=con.createStatement();
		} 
		 catch (Exception e) {
			e.printStackTrace();
		}
			
	}
}
