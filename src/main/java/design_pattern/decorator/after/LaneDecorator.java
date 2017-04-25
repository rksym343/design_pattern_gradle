package design_pattern.decorator.after;

public class LaneDecorator extends DisplayDecorator {

	public LaneDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	void draw() {
		super.draw();
		drawLane();

	}

	private void drawLane() {
		System.out.println("\t차선표시");
	}

}
