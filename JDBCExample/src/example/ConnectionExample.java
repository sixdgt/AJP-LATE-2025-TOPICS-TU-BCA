package example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
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
			} else {
				System.out.println("Connection failed!!");
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
