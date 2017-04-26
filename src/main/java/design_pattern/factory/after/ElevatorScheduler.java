package design_pattern.factory.after;

public interface ElevatorScheduler {
	 int selectElevator(ElevatorManager manager, int destination, Direction direction);
}
