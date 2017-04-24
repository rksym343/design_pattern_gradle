package design_pattern.command.after;

public class Client {
	public static void main(String[] args) {
		
		
		Lamp theLamp = new Lamp();
		Command lampOnCommand = new LampOnCommand(theLamp);
		
		Alarm theAlarm = new Alarm();
		Command alarmOnCommand = new AlarmOnCommand(theAlarm);
		
		Button button = new Button(alarmOnCommand);
		button.pressed();

		button.setTheCommand(lampOnCommand);
		button.pressed();
		
		Robot theRobot = new Robot();
		Command robotOnCommand = new RobotOnCommand(theRobot);
		button.setTheCommand(robotOnCommand);
		button.pressed();
	}
}
