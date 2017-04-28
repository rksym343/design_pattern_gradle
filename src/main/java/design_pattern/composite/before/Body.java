package design_pattern.composite.before;

public class Body {
	private int price;
	private int power;

	public Body(int power, int price) {
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
