package design_pattern.factory.before;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private ThroughputScheduler 	scheduler;
	public ElevatorManager(int controllerCount) {
		controllers = new ArrayList<>();
		for ( int i = 0; i < controllerCount; i++){
			controllers.add(new ElevatorController(i));
		}
		scheduler = new ThroughputScheduler();
	}
	void requestElevator(int destination, Direction direction){
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectElevator).gotoFloor(destination);
	}
	
	
}
