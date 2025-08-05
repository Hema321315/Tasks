package tasks2;
import java.sql.*;
import java.util.Scanner;
public class DBConnect2 
{
	    public static void main(String[] args)
	    {
	        String url = "jdbc:mysql://localhost:3306/wiprodb_one";
	        String user = "root";
	        String password = "Hema@sree8100";

	        try (Connection conn = DriverManager.getConnection(url, user, password);
	             Scanner sc = new Scanner(System.in)){
	        	
	            System.out.println("Connected!");
	            String createSQL = "CREATE TABLE IF NOT EXISTS Students (" +
	                               "id INT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100))";
	            try (Statement stmt = conn.createStatement())
	            {
	                stmt.executeUpdate(createSQL);
	                System.out.println("Table ensured.");
	            }

	            //  Insert data using PreparedStatement (Exercise 5)
	            String insertSQL = "INSERT IGNORE INTO Students VALUES (?, ?, ?)";
	            try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
	                pstmt.setInt(1, 1);
	                pstmt.setString(2, "Anil");
	                pstmt.setString(3, "anil@example.com");
	                pstmt.executeUpdate();

	                pstmt.setInt(1, 2);
	                pstmt.setString(2, "Rohith");
	                pstmt.setString(3, "rohith@example.com");
	                pstmt.executeUpdate();

	                pstmt.setInt(1, 3);
	                pstmt.setString(2, "Charlie");
	                pstmt.setString(3, "charlie@example.com");
	                pstmt.executeUpdate();
	                System.out.println("Records inserted.");
	            }

	            //  Update a record (Exercise 6)
	            String updateSQL = "UPDATE Students SET email = ? WHERE id = ?";
	            try (PreparedStatement pstmt = conn.prepareStatement(updateSQL)) {
	                pstmt.setString(1, "newbob@example.com");
	                pstmt.setInt(2, 2);
	                pstmt.executeUpdate();
	                System.out.println("Email updated for ID 2.");
	            }

	            // Delete a record (Exercise 7)
	            String deleteSQL = "DELETE FROM Students WHERE id = ?";
	            try (PreparedStatement pstmt = conn.prepareStatement(deleteSQL)) {
	                pstmt.setInt(1, 1);
	                pstmt.executeUpdate();
	                System.out.println("Record with ID 1 deleted.");
	            }

	            //  Search by name (Exercise 8)
	            System.out.print("Enter name to search: ");
	            String nameInput = sc.nextLine();
	            String searchSQL = "SELECT * FROM Students WHERE name = ?";
	            try (PreparedStatement pstmt = conn.prepareStatement(searchSQL)) {
	                pstmt.setString(1, nameInput);
	                ResultSet rs = pstmt.executeQuery();
	                System.out.println("Search results:");
	                while (rs.next()) {
	                    System.out.println(rs.getInt("id") + " - " +
	                                       rs.getString("name") + " - " +
	                                       rs.getString("email"));
	                }
	            }

	            // Stored procedure call using CallableStatement (Exercise 9)
	            System.out.print("Enter ID to fetch via stored procedure: ");
	            int fetchId = sc.nextInt();
	            String callSQL = "{call getStudentById(?)}";
	            try (CallableStatement cs = conn.prepareCall(callSQL)) {
	                cs.setInt(1, fetchId);
	                ResultSet rs = cs.executeQuery();
	                System.out.println("Stored procedure result:");
	                while (rs.next()) {
	                    System.out.println("Name: " + rs.getString("name") +
	                                       ", Email: " + rs.getString("email"));
	                }
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
}
