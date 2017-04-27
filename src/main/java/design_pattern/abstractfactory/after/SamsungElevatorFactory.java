package design_pattern.abstractfactory.after;

public class SamsungElevatorFactory implements ElevatorFactory {
	private static final SamsungElevatorFactory instance = new SamsungElevatorFactory();

	private SamsungElevatorFactory() {
	}

	public static SamsungElevatorFactory getInstance() {
		return instance;
	}

	@Override
	public Motor createMotor() {
		return new SamsungMotor();
	}

	@Override
	public Door createDoor() {
		return new SamsungDoor();
	}

}
