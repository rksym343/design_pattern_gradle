package design_pattern.composite.before;

public class Monitor {
	private int price;
	private int power;

	public Monitor(int power, int price) {
		this.price = price;
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public int getPower() {
		return power;
	}

}
