package view;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import controller.StudentController;

public class StudentView {
	public void createStudent() {
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
			System.out.println("-------------------------------------");
		} else {
			System.out.println("Failed!!");
		}
	}
	
	public void showStudentList() {
		StudentController sc = new StudentController();
		HashMap<Integer, HashMap<String, String>> data = sc.showAllStudent();
		System.out.println("------All student data-----------");
		for (Map.Entry<Integer, HashMap<String, String>> record : data.entrySet()) {
	        HashMap<String, String> student = record.getValue();
	        System.out.println(student.get("first_name"));
	        System.out.println(student.get("last_name"));
	        System.out.println(student.get("email"));
	        System.out.println(student.get("gender"));
	        System.out.println(student.get("address"));
	        System.out.println(student.get("registration_no"));
	        System.out.println("---------------------------");
	    }
	}
	
	public void start() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("----------- Welcome to MVC Session -----");
	    System.out.println("To view student list enter: VIEW");
	    System.out.println("To add new student enter: ADD");
	    System.out.println("To exit enter: EXIT");
	    System.out.print("Enter Action: ");
	    String action = sc.nextLine().trim().toUpperCase();
	    StudentView sv = new StudentView();
	    switch (action) {
	        case "VIEW":
	            sv.showStudentList();
	            System.out.println();
	            start();  // recursive call
	            break;
	        case "ADD":
	            sv.createStudent();
	            System.out.println();
	            start();  // recursive call
	            break;
	        case "EXIT":
	            System.out.println("Exiting program...");
	            return;  // base condition → stop recursion
	        default:
	            System.out.println("Invalid action! Try again.");
	            System.out.println();
	            start();  // recursive call
	    }
	}

	public static void main(String args[]) {
		StudentView sv = new StudentView();
		sv.start();
	}
}
