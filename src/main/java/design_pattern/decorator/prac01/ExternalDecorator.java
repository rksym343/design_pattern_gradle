package design_pattern.decorator.prac01;

public class ExternalDecorator extends EMailContentDecorator {

	public ExternalDecorator(EMailContent eMailContent) {
		super(eMailContent);
	}

	@Override
	public String printEMail() {
		return addDisclaimer(super.printEMail());
	}

	private String addDisclaimer(String content) {
		return content + " Company Disclaimer";
	}

}
