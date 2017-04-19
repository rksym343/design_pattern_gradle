package design_pattern.ch01.check04;

import java.util.ArrayList;

public class Course {
	private String name;
	private ArrayList<Student> students;

	public Course() {
		super();
		students = new ArrayList<>();
	}

	public Course(String no) {
		super();
		this.name = name;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void registerStudent(Student student) {
		if (students.contains(student)) {
			return;
		}
		students.add(student);
		student.registerCourse(this);
	}

	public void dropStudent(Student student) {
		if (students.contains(student)) {
			students.remove(student);
			student.dropCourse(this);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("\"%s\"", name);
		// return String.format("[%s]", name);
	}

}
