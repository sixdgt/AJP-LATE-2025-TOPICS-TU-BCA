package controller;
import java.util.ArrayList;
import java.util.HashMap;
import model.StudentModel;

public class StudentController {
	public boolean recordStudent(HashMap<String, String> data) {
		boolean status = false;
		StudentModel sm = new StudentModel();
		sm.setFirstName(data.get("first_name"));
		sm.setLastName(data.get("last_name"));
		sm.setEmail(data.get("email"));
		sm.setGender(data.get("gender"));
		sm.setAddress(data.get("address"));
		sm.setRegistrationNo(Integer.parseInt(data.get("registration_no")));
		if(sm.insertStudent(sm)) {
			status = true;
		}
		return status;
	}
	
	public HashMap<Integer, HashMap<String, String>> showAllStudent(){
		HashMap<Integer, HashMap<String, String>> all_data = new HashMap<>();
		StudentModel sm = new StudentModel();
		ArrayList<StudentModel> db_data = sm.selectStudentList();
		int counter = 0;
		for (StudentModel studentModel : db_data) {
			HashMap<String, String> students = new HashMap<>();
			students.put("first_name", studentModel.getFirstName());
			students.put("last_name", studentModel.getLastName());
			students.put("email", studentModel.getEmail());
			students.put("address", studentModel.getAddress());
			students.put("gender", studentModel.getGender());
			students.put("registration_no", studentModel.getRegistrationNo() + "");
			all_data.put(counter, students);
			counter++;
		}
		return all_data;
	}
}
