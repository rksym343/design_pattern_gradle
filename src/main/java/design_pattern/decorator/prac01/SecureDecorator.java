package design_pattern.decorator.prac01;

public class SecureDecorator extends EMailContentDecorator {

	public SecureDecorator(EMailContent eMailContent) {
		super(eMailContent);
	}

	@Override
	public String printEMail() {
		return encrypt(super.printEMail());
	}

	private String encrypt(String content) {
		return content + " Encrypted";
	}

}
