package design_pattern.command.after;

public class RobotOnCommand implements Command {
	private Robot theRobot;

	public RobotOnCommand(Robot theRobot) {
		super();
		this.theRobot = theRobot;
	}

	@Override
	public void execute() {
		theRobot.start();
	}

}
