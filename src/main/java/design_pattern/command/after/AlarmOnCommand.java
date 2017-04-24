package design_pattern.command.after;

public class AlarmOnCommand implements Command {

	private Alarm theAlarm;

	public AlarmOnCommand(Alarm theAlarm) {
		super();
		this.theAlarm = theAlarm;
	}

	@Override
	public void execute() {
		theAlarm.start();
	}

}
