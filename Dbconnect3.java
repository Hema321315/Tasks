package tasks2;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Dbconnect3 
{
		 public static void main(String[] args) throws Exception 
		 {
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wiprodb_one", "root", "Hema@sree8100");
		 Scanner sc = new Scanner(System.in);
		 int choice;
		 do {
		 System.out.println("1. Add\n2. View\n3. Update\n4. Delete\n5. Exit");
		 choice = sc.nextInt();
		 sc.nextLine(); // consume newline
		 switch (choice) {
		 case 1:
		 System.out.print("ID: "); int id = sc.nextInt();
		 sc.nextLine();
		 System.out.print("Name: "); String name = sc.nextLine();
		 System.out.print("Email: "); String email = 
		sc.nextLine();
		 PreparedStatement ps = conn.prepareStatement("INSERT INTO Students VALUES (?, ?, ?)");
		 ps.setInt(1, id); ps.setString(2, name); ps.setString(3, 
		email);
		 ps.executeUpdate();
		 break;
		 case 2:
		 ResultSet rs = 
		conn.createStatement().executeQuery("SELECT * FROM Students");
		 while (rs.next()) {
		 System.out.println(rs.getInt("id") + " - " + 
		rs.getString("name") + " - " + rs.getString("email"));
		 }
		 break;
		 case 3:
		 System.out.print("Enter ID to update: "); int uid = 
		sc.nextInt();
		 sc.nextLine();
		 System.out.print("New Email: "); String newEmail = 
		sc.nextLine();
		 PreparedStatement ups = conn.prepareStatement("UPDATE Students SET email=? WHERE id=?");
		 ups.setString(1, newEmail); ups.setInt(2, uid); 
		ups.executeUpdate();
		 break;
		 case 4:
		 System.out.print("Enter ID to delete: "); int did = 
		sc.nextInt();
		 PreparedStatement dps = conn.prepareStatement("DELETE FROM Students WHERE id=?");
		 dps.setInt(1, did); dps.executeUpdate();
		 break;
		 case 5:
		 System.out.println("Exiting...");
		 break;
		 }
		 } while (choice != 5);
		 conn.close();
		 }
}

