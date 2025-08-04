package tasks2;
import java.sql.*; 

public class Jdbcexercises {
public static void main(String[] args) 
{
	try 
	{ 
	Connection conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/wiprodb_one", "root", "Hema@sree8100"); 
	System.out.println("Connected!"); 
//	conn.close(); 
	} catch (SQLException e) { 
	e.printStackTrace(); 
	}
	try {
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
			Statement stmt = conn.createStatement(); 
			String createSQL = "CREATE TABLE Students (id INT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))"; 
			stmt.executeUpdate(createSQL); 
			System.out.println("Table created successfully."); 
//			conn.close(); 
	}catch(SQLException e)
	{
		e.printStackTrace();	
		}
	try {
	Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
	Statement stmt = conn.createStatement(); 
	stmt.executeUpdate("INSERT INTO Students VALUES (1, 'hema','hema@example.com')"); 
	stmt.executeUpdate("INSERT INTO Students VALUES (2, 'abhi','abhi@example.com')"); 
	System.out.println("Data inserted.");
	}catch(SQLException e) {
		e.printStackTrace();	
		}
	try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
		Statement stmt = conn.createStatement(); 
		ResultSet rs = stmt.executeQuery("SELECT * FROM Students"); 
		while (rs.next()) 
		{ 
		System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " 
		+ rs.getString("email")); 
		}
	}catch(SQLException e) {
		e.printStackTrace()
;}	}
}

