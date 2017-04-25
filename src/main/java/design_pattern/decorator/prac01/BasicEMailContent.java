package design_pattern.decorator.prac01;

public class BasicEMailContent extends EMailContent {

	private String content;

	public BasicEMailContent(String content) {
		this.content = content;
	}

	@Override
	public String printEMail() {
		return content;
	}

}
