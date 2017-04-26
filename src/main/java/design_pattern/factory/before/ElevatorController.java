package design_pattern.factory.before;

public class ElevatorController {
	private int id; // delevator number
	private int curFloor;

	public ElevatorController(int id) {
		this.id = id;
		curFloor = 1;
	}

	public void gotoFloor(int destination) {
		System.out.printf("Elevator [%d] Floor : %d%n", id, curFloor);
		curFloor = destination;
		System.out.printf("==> [%d]%n",curFloor);
	}

}
