package design_pattern.state.after;

public class Sleeping implements State {
	private static final Sleeping instance = new Sleeping();

	private Sleeping() {
	}

	public static Sleeping getInstance() {
		return instance;
	}

	@Override
	public void on_button_pushed(Light light) {
		System.out.println("Light On");
		light.setState(On.getInstance());
	}

	@Override
	public void off_button_pushed(Light light) {
		System.out.println("Light Off");
		light.setState(Off.getInstance());
	}

}
