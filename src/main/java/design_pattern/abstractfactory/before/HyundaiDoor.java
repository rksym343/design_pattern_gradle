package design_pattern.abstractfactory.before;

public class HyundaiDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close [ %s Door ]%n", "Hyundai");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open [ %s Door ]%n", "Hyundai");
	}

}
