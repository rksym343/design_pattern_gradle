package design_pattern.abstractfactory.after;

public class Client2 {
	public static void main(String[] args) {

		Door door = createFactory("Lg").createDoor();
		Motor motor = createFactory("Hyundai").createMotor();
		motor.setDoor(door);
		door.open();
		motor.move(Direction.UP);
	}

	private static ElevatorFactory createFactory(String vendorName) {
		ElevatorFactory factory = null;
		VendorID vendorID = null;
		if (vendorName.equalsIgnoreCase("lg")) {
			vendorID = VendorID.LG;
		} else if (vendorName.equalsIgnoreCase("hyundai")) {
			vendorID = VendorID.HYUNDAI;
		} else if (vendorName.equalsIgnoreCase("samsung")) {
			vendorID = VendorID.SAMSUNG;
		}
		return ElevatorFactoryFactory.getFactory(vendorID);
	}
}
