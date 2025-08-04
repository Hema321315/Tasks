package tasks2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Jdbcpreparedstmt {
	public static void main(String[] args)
	{try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 

		String sql="INSERT INTO user(username,password)VALUES(?,?)";
		PreparedStatement stmt=conn.prepareStatement(sql);
		stmt.setString(1,"Srinivas");
		stmt.setString(2, "1234567");
		stmt.executeUpdate();
		System.out.println("record inserted successfully!!!!");
	}catch(SQLException e) {
		e.printStackTrace();
	}
	try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
        String sql="UPDATE user SET username=?,password=? WHERE id=2";
		PreparedStatement stmt =conn.prepareStatement(sql);
		stmt.setString(1,"hema");
		stmt.setString(2, "888888");
		stmt.setInt(2,6);
		stmt.executeUpdate();
		System.out.println("Record Inserted suceessfully!!");
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
        String sql="DELETE  from user where id=?" ;
		PreparedStatement stmt =conn.prepareStatement(sql);
		stmt.setInt(1,4);
		stmt.executeUpdate();
		System.out.println("Record Inserted suceessfully!!");
	}catch(SQLException ex) {
		ex.printStackTrace();
	}
	try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root","Hema@sree8100"); 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter name to search: "); 
		String name = sc.nextLine(); 
		String sql = "SELECT * FROM Students WHERE name = ?"; 
		PreparedStatement pstmt = conn.prepareStatement(sql); 
		pstmt.setString(1, name); 
		ResultSet rs = pstmt.executeQuery(); 
		while (rs.next())
		{ 
		System.out.println(rs.getInt("id") + " - " + rs.getString("name") + " - " 
		+ rs.getString("email")); 
		}
	}catch(SQLException ex) {
		ex.printStackTrace();	}
		
	}
	}


