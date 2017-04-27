package design_pattern.abstractfactory.after;

public class ElevatorFactoryFactory {
	
	public static ElevatorFactory getFactory(VendorID vendorID){
		ElevatorFactory elevatorFactory = null;
		switch (vendorID) {
		case HYUNDAI:
			elevatorFactory = HyundaiElevatorFactory.getInstance();
			break;
		case LG:
			elevatorFactory = LGElevatorFactory.getInstance();
			break;
		case SAMSUNG:
			elevatorFactory = SamsungElevatorFactory.getInstance();
			break;
		}
		return elevatorFactory;
	}
}
