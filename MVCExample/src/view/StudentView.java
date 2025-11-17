package view;
import java.util.HashMap;
import java.util.Scanner;
import controller.StudentController;

public class StudentView {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> data = new HashMap<>();
		System.out.println("Please provide the student details");
		
		System.out.println("Enter First Name: ");
		String first_name = sc.nextLine();
		data.put("first_name", first_name);
		
		System.out.println("Enter Last Name: ");
		String last_name = sc.nextLine();
		data.put("last_name", last_name);
		
		System.out.println("Enter Email: ");
		String email = sc.nextLine();
		data.put("email", email);
		
		System.out.println("Enter Gender: ");
		String gender = sc.nextLine();
		data.put("gender", gender);
		
		System.out.println("Enter Address: ");
		String address = sc.nextLine();
		data.put("address", address);
		
		System.out.println("Enter Registration Number: ");
		String registration_no = sc.nextLine();
		data.put("registration_no", registration_no);
		
		StudentController std = new StudentController();
		if(std.recordStudent(data)) {
			System.out.println("Data added successfully");
		} else {
			System.out.println("Failed!!");
		}
	}
}
