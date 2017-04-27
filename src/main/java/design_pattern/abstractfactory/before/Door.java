package design_pattern.abstractfactory.before;

public abstract class Door {
	private DoorStatus doorStatus;

	public Door() {
		this.doorStatus = DoorStatus.CLOSED;
	}

	public DoorStatus getDoorStatus() {
		return doorStatus;
	}

	public void close() {
		if(this.doorStatus == DoorStatus.CLOSED){
			return;
		}
		doClose();
		this.doorStatus = DoorStatus.CLOSED;
		
	}

	protected abstract void doClose();

	public void open() {
		if(this.doorStatus == DoorStatus.OPENED){
			return;
		}
		doOpen();
		this.doorStatus = DoorStatus.OPENED;
	}

	protected abstract void doOpen();
}
