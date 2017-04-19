package design_pattern.ch01.check02;

public class TestMain {

	public static void main(String[] args) {
		Phone p1 = new Phone("010-1234-5678");
		Phone p2 = new Phone("010-1111-2222");
		Person pp = new Person();
		pp.setHomePhones(p1);
		pp.setOfficePhones(p2);
		System.out.println(pp);

	}

}
