package design_pattern.abstractfactory.after;

public class LGElevatorFactory implements ElevatorFactory {
	private static final LGElevatorFactory instance = new LGElevatorFactory();

	private LGElevatorFactory() {
	}

	public static LGElevatorFactory getInstance() {
		return instance;
	}

	@Override
	public Motor createMotor() {
		return new LGMotor();
	}

	@Override
	public Door createDoor() {
		return new LGDoor();
	}

}
