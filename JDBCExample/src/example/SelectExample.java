package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectExample {
	public static void main(String args[]) {
		try {
			String db_name = "jdbc_demo";
			String url = "jdbc:mysql://localhost:3306/" + db_name;
			String username = "root";
			String password = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, username, password);
			if(con != null) {
				System.out.println("Connection established successfully");
				Statement stmt = con.createStatement();
				String query = "SELECT * FROM student";
				ResultSet data = stmt.executeQuery(query);
				if(data != null) {
					while(data.next()) {
						System.out.println("Name: " + data.getString("first_name") + " "
								+ data.getString("last_name"));
						System.out.println("Email: " + data.getString("email"));
						System.out.println("Gender: " + data.getString("gender"));
						System.out.println("Address: " + data.getString("address"));
						System.out.println("Registration No: " + data.getInt("registration_no"));
						System.out.println("");
					}
				}
			} else {
				System.out.println("Connection failed!!");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
