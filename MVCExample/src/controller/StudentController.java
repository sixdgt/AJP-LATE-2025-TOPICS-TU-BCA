package controller;
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
}
