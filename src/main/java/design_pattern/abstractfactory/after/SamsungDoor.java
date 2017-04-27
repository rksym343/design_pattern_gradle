package design_pattern.abstractfactory.after;

public class SamsungDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close [ %s Door ]%n", "Samsung");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open [ %s Door ]%n", "Samsung");
	}

}
