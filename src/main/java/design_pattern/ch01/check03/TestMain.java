package design_pattern.ch01.check03;

public class TestMain {
	
	public static void main(String[] args) {
		Professor pr = new Professor();
		Student st = new Student();
	//	pr.setStudent(st);
		st.setAdvisor(pr);
		System.out.println(pr);
		System.out.println(st);
	}
	
	
	
}
