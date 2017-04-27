package design_pattern.abstractfactory.after;

public class HyundaiElevatorFactory implements ElevatorFactory {
	private static final HyundaiElevatorFactory instance = new HyundaiElevatorFactory();
	
	private HyundaiElevatorFactory() {}
	

	public static HyundaiElevatorFactory getInstance() {
		return instance;
	}


	@Override
	public Motor createMotor() {
		return new HyundaiMotor();
	}

	@Override
	public Door createDoor() {
		return new HyundaiDoor();
	}

}
