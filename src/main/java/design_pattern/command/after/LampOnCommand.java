package design_pattern.command.after;

public class LampOnCommand implements Command {
	private Lamp theLamp;

	public LampOnCommand(Lamp theLamp) {
		super();
		this.theLamp = theLamp;
	}

	@Override
	public void execute() {
		theLamp.turnOn();
	}

}
