package design_pattern.state.after;

public class Client {
	public static void main(String[] args) {
		Light light = new Light();	//off
		light.off_button_pushed();	// off - 반으없임
		light.on_button_pushed();	// on
		light.on_button_pushed();	// sleeping
		light.on_button_pushed();	// on
		light.off_button_pushed();	// off
	}
}
