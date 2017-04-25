package design_pattern.decorator.after;

public class Client {
	public static void main(String[] args) {
		Display road = new TrafficDecorator(new LaneDecorator(new RoadDisplay()));
		road.draw();
		
		System.out.println("===============================");
		
		Display road2 = new CrossingDecorator(new TrafficDecorator(new LaneDecorator(new RoadDisplay())));
		road2.draw();
		
		String str = "ddd";
	}
	
}
