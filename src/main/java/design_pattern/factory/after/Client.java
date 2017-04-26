package design_pattern.factory.after;

public class Client {
	public static void main(String[] args) {
		ElevatorManager emWithRes = new ElevatorManager(3, SchedulingStrategyID.RESPONSE_TIME);
		emWithRes.requestElevator(10, Direction.UP);
		
		
		ElevatorManager emWithTh = new ElevatorManager(3, SchedulingStrategyID.THROUGHPUT);
		emWithTh.requestElevator(10, Direction.UP);
		
		
		ElevatorManager emWithDy = new ElevatorManager(3, SchedulingStrategyID.DYNAMIC);
		emWithDy.requestElevator(10, Direction.UP);
	}
}
