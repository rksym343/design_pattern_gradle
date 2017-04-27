package design_pattern.abstractfactory.before;

public class LGDoor extends Door {

	@Override
	protected void doClose() {
		System.out.printf("Close [ %s Door ]%n", "LG");
	}

	@Override
	protected void doOpen() {
		System.out.printf("Open [ %s Door ]%n", "LG");
	}

}
