package design_pattern.ch01.check03;

import java.util.ArrayList;

public class Professor {
	private ArrayList<Student> students;

	

	public ArrayList<Student> getStudent() {
		return students;
	}



	public void setStudent(ArrayList<Student> students) {
		this.students = students;
	}



	@Override
	public String toString() {
		return "Professor [student=" + students + "]";
	}
	
	
}
