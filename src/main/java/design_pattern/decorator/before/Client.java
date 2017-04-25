package design_pattern.decorator.before;

public class Client {
	public static void main(String[] args) {
		RoadDisplay roadDisplay = new RoadDisplay();
		roadDisplay.draw(); // 기본도로

		RoadDisplayWithLane roadDisplayWithLane = new RoadDisplayWithLane();
		roadDisplayWithLane.draw(); // 기본도로 + 차선표시
	}
}
