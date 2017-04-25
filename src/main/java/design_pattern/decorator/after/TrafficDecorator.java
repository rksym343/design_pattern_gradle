package design_pattern.decorator.after;

public class TrafficDecorator extends DisplayDecorator {

	public TrafficDecorator(Display decoratedDisplay) {
		super(decoratedDisplay);
	}

	@Override
	void draw() {
		super.draw();
		drawTraffic();
	}

	private void drawTraffic() {
		System.out.println("\t\t교통량 표시");
	}

}
