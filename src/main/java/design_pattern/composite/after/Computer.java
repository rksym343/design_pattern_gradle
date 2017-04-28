package design_pattern.composite.after;

import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice{
	private List<ComputerDevice> components = new ArrayList<>();

	public void addComponent(ComputerDevice computerDevice) {
		components.add(computerDevice);
	}

	public void removeComponent(ComputerDevice computerDevice) {
		components.remove(computerDevice);
	}

	@Override
	public int getPrice() {
		int price = 0;
		for(ComputerDevice device : components){
			price += device.getPrice();
		}
		return price;
	}

	@Override
	public int getPower() {
		int power = 0;
		for(ComputerDevice device : components){
			power += device.getPower();
		}
		return power;
	}

	@Override
	public String toString() {
		return String.format("Computer Power : %dW%nComputer Price : %d만원", getPower(), getPrice());
	}

}
