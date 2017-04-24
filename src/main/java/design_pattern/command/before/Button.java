package design_pattern.command.before;

public class Button {
	private Lamp theLamp;

	public Button(Lamp theLamp) {
		this.theLamp = theLamp;
	}

	public void pressed() {
		theLamp.turnOn();
	}

}
