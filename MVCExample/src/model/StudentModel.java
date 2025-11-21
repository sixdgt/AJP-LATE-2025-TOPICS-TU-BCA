package model;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentModel {
	private int student_id;
	private String first_name;
	private String last_name;
	private String email;
	private String gender;
	private String address;
	private int registration_no;
	protected Connection connect;
	
	public int getStudentId() { return this.student_id; }
	public void setStudentId(int id) { this.student_id = id; }
	
	public String getFirstName() { return this.first_name; }
	public void setFirstName(String first_name) { this.first_name = first_name; }
	
	public String getLastName() { return this.last_name; }
	public void setLastName(String last_name) { this.last_name = last_name; }
	
	public String getEmail() { return this.email; }
	public void setEmail(String email) { this.email = email; }
	
	public String getGender() { return this.gender; }
	public void setGender(String gender) { this.gender = gender; }
	
	public String getAddress() { return this.address; }
	public void setAddress(String address) { this.address = address; }
	
	public int getRegistrationNo() { return this.registration_no; }
	public void setRegistrationNo(int reg_no) { this.registration_no = reg_no; }
	
	public void createConnection() {
		try {
			String db_name = "jdbc_demo";
			String url = "jdbc:mysql://localhost:3306/" + db_name;
			String username = "root";
			String password = "1234";
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connect = DriverManager.getConnection(url, username, password);
			if(this.connect != null) {
				System.out.println("Connection established successfull");
			}
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Connection Failed!!");
		}
	}
	
	public boolean insertStudent(StudentModel sm) {
		boolean status = false;
		this.createConnection();
		try {
			Statement stmt = this.connect.createStatement();
			String query = "INSERT INTO student(first_name, last_name, email, gender,"
					+ "address, registration_no) values('"+ sm.getFirstName() +"',"
					+ "'" + sm.getLastName() + "', '" + sm.getEmail() + "', "
					+ "'" + sm.getGender() + "', ' " + sm.getAddress() + "', " 
					+ sm.getRegistrationNo() + ")";
			if(stmt.executeUpdate(query) > 0) {
				status = true;
			}
		} catch (Exception e) {
			System.out.println("Something went wrong while storing student data!!");
		}
		return status;
	}
	
	public ArrayList<StudentModel> selectStudentList() {
		ArrayList<StudentModel> data = new ArrayList<StudentModel>();
		try {
			this.createConnection();
			Statement stmt = this.connect.createStatement();
			String query = "SELECT * FROM student";
			ResultSet result = stmt.executeQuery(query);
			while(result.next()) {
				StudentModel sm = new StudentModel();
				sm.setFirstName(result.getString("first_name"));
				sm.setLastName(result.getString("last_name"));
				sm.setEmail(result.getString("email"));
				sm.setAddress(result.getString("address"));
				sm.setGender(result.getString("gender"));
				sm.setRegistrationNo(result.getInt("registration_no"));
				data.add(sm);
			}
		} catch (Exception e) {
			System.out.println("Something went wrong!!");
		}
		return data;
	}
}
