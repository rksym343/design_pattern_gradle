package design_pattern.template;

public class Door {
	private DoorStatus doorSatus;

	public Door() {
		doorSatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorSatus() {
		return doorSatus;
	}

	public void open() {
		doorSatus = DoorStatus.OPEND;
	}

	public void close() {
		doorSatus = DoorStatus.CLOSED;
	}

}
