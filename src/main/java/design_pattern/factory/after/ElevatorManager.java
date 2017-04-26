package design_pattern.factory.after;

import java.util.ArrayList;
import java.util.List;

public class ElevatorManager {
	private List<ElevatorController> controllers;
	private SchedulingStrategyID strategyId;
	
	public ElevatorManager(int controllerCount, SchedulingStrategyID strategyId) {
		controllers = new ArrayList<>();
		for ( int i = 0; i < controllerCount; i++){
			controllers.add(new ElevatorController(i));
		}
		this.strategyId = strategyId;
	}
	
	public void setStrategyId(SchedulingStrategyID strategyId) {
		this.strategyId = strategyId;
	}
	
	void requestElevator(int destination, Direction direction){
		ElevatorScheduler scheduler = SchedulerFactory.getScheduler(strategyId);
		System.out.println(scheduler);
		int selectElevator = scheduler.selectElevator(this, destination, direction);
		controllers.get(selectElevator).gotoFloor(destination);
	}
	
	
	
}
