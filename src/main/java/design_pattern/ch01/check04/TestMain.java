package design_pattern.ch01.check04;

public class TestMain {
	public static void main(String[] args) {

		Course java = new Course();
		java.setName("Java");
		Course android = new Course();
		android.setName("android");
		Course database = new Course();
		database.setName("Database");
		Course html = new Course();
		html.setName("Html");

		Student stu = new Student();
		stu.setName("SDH");
		stu.registerCourse(java);
		stu.registerCourse(database);
		stu.registerCourse(database);
		stu.dropCourse(database);
		stu.registerCourse(database);

		Student stu2 = new Student();
		stu2.setName("222");
		stu2.registerCourse(database);
		Student stu3 = new Student();
		stu3.setName("333");
		stu3.registerCourse(java);
		stu3.registerCourse(android);
		Student stu4 = new Student();
		stu4.setName("444");
		stu4.registerCourse(html);

		database.registerStudent(stu4);

		prnStudentList(java);
		prnStudentList(database);
		prnStudentList(android);
		prnStudentList(html);

		prnCourseList(stu);
		prnCourseList(stu2);
		prnCourseList(stu3);
		prnCourseList(stu4);
	}

	public static void prnCourseList(Student std) {
		System.out.println("======================");
		System.out.println(std.getName() + "학생이 수강하는 수업은");
		System.out.println(std.getCourses());
		System.out.println("======================");
	}

	public static void prnStudentList(Course course) {
		System.out.println("---------------------------------");
		System.out.println(course.getName() + "수업을 수강하는 학생은");
		System.out.println(course.getStudents());
		System.out.println("---------------------------------");
	}
}
