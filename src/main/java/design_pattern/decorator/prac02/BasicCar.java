package design_pattern.decorator.prac02;

public class BasicCar extends CarComponent {

	private int price;

	public BasicCar(int price) {
		this.price = price;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getCarinfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
