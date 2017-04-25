package design_pattern.decorator.after;

public class DisplayDecorator extends Display {
	private Display decoratedDisplay;

	public DisplayDecorator(Display decoratedDisplay) {
		this.decoratedDisplay = decoratedDisplay;
	}

	@Override
	void draw() {
		decoratedDisplay.draw();
	}

}
