package design_pattern.composite.after;

public class Body extends ComputerDevice{
	private int price;
	private int power;

	public Body(int power, int price) {
		this.price = price;
		this.power = power;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public int getPower() {
		return power;
	}

}
