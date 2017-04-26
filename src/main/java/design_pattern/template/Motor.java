package design_pattern.template;

public abstract class Motor {
	protected Door door;
	protected MotorStatus motorStaus;

	public Motor(Door door) {
		this.door = door;
		motorStaus = MotorStatus.STOPPED;
	}

	public MotorStatus getMotorStaus() {
		return motorStaus;
	}

	protected void setMotorStaus(MotorStatus motorStaus) {
		this.motorStaus = motorStaus;
	}

	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStaus();
		if (motorStatus == MotorStatus.MOVING) {
			return;
		}
		DoorStatus doorStatus = door.getDoorSatus();
		if (doorStatus == DoorStatus.OPEND) {
			door.close();
		}
		moveMotor(direction); // hook method
		setMotorStaus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction); // hook method

	@Override
	public String toString() {
		String motorStatus = getMotorStaus() == MotorStatus.MOVING ? "이동 중" : "중지";
		String doorStatus = door.getDoorSatus() == DoorStatus.OPEND ? "문 열림" : "문 닫힘";
		return String.format("모터상태 : %s / 문의 상태 : %s", motorStatus, doorStatus);
	}
}
