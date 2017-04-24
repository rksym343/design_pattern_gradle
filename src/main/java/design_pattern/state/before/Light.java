package design_pattern.state.before;

public class Light {
	private static final int ON = 0;
	private static final int OFF = 1;

	private int state;

	public Light() {
		state = Light.OFF;
	}

	public void on_button_pushed() {
		if (state == Light.ON) {
			System.out.println("반응 없음");
		} else {
			System.out.println("Light On");
			state = Light.ON;
		}
	}

	public void off_button_pushed() {
		if (state == Light.OFF) {
			System.out.println("반응 없음");
		} else {
			System.out.println("Light On");
			state = Light.OFF;
		}
	}
}
