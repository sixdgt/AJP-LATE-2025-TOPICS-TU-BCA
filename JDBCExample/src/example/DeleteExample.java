package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteExample {
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
				int registration_no = 25007;
				String query = "DELETE FROM student WHERE registration_no="+ registration_no;
				Statement stmt = con.createStatement();
				int result = stmt.executeUpdate(query);
				if(result > 0) {
					System.out.println("Data deleted successfully!");
				} else {
					System.out.println("Something went wrong!!");
				}
			} else {
				System.out.println("Connection failed!!");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
