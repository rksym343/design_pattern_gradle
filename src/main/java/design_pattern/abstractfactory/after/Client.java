package design_pattern.abstractfactory.after;

public class Client {
	public static void main(String[] args) {
		/*
		 * Door lgDoor = DoorFactory.createDoor(VendorID.LG); Motor lgMotor =
		 * MotorFactory.createMotor(VendorID.LG); lgMotor.setDoor(lgDoor);
		 * lgDoor.open(); lgMotor.move(Direction.UP);
		 */

		ElevatorFactory factory = null;
		String vendorName = "samsung";
		VendorID vendorID = null;

		if (vendorName.equalsIgnoreCase("lg")) {
			vendorID = VendorID.LG;
		} else if (vendorName.equalsIgnoreCase("hyundai")) {
			vendorID = VendorID.HYUNDAI;
		} else if (vendorName.equalsIgnoreCase("samsung")) {
			vendorID = VendorID.SAMSUNG;
		}

		factory = ElevatorFactoryFactory.getFactory(vendorID);
		Door door = factory.createDoor();
		Motor motor = factory.createMotor();
		motor.setDoor(door);
		door.open();
		motor.move(Direction.UP);
	}
}
