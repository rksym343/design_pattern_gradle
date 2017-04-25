package design_pattern.decorator.prac01;

public class EMailContentDecorator extends EMailContent {

	private EMailContent eMailContent;

	public EMailContentDecorator(EMailContent eMailContent) {
		this.eMailContent = eMailContent;
	}

	@Override
	public String printEMail() {
		return eMailContent.printEMail();
	}

}
