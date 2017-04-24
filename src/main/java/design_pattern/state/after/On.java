package design_pattern.state.after;

import design_pattern.state.after.Light;

public class On implements State {
	private static final On instance = new On();

	private On() {
	}

	public static On getInstance() {
		return instance;
	}

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("취침등");
		light.setState(Sleeping.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(Off.getInstance());
	}

}
