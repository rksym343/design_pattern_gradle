package design_pattern.decorator.before;

public class RoadDisplayWithLane extends RoadDisplay{
	public void draw() {
		super.draw();
		drawLane();
	}

	private void drawLane() {
		System.out.println("차선 표시");
	}
}
