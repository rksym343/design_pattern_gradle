package design_pattern.decorator.after;

public class CrossingDecorator extends DisplayDecorator {

	public CrossingDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	void draw() {
		super.draw();
		drawCrossing();
	}

	private void drawCrossing() {
		System.out.println("\t\t\t교차로 표시");
	}
	
	

}
