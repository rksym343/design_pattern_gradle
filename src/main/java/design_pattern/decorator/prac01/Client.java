package design_pattern.decorator.prac01;

public class Client {
	public static void main(String[] args) {
		EMailContent email = new SecureDecorator(new ExternalDecorator(new BasicEMailContent("편지 본문")));
		System.out.println(email.printEMail());
		
	}
}
