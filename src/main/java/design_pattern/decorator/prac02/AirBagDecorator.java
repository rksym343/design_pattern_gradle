package design_pattern.decorator.prac02;

public class AirBagDecorator extends CarOptionDecorator {

	private int airBagPrice = 10000;

	public AirBagDecorator(CarComponent decoratedCar, int airBagPrice) {
		super(decoratedCar);
		this.airBagPrice = airBagPrice;
	}

	@Override
	public int getPrice() {
		return super.getPrice() + getAirBagPrice();
	}
	

	@Override
	public String getCarinfo() {
		// TODO Auto-generated method stub
		return super.getCarinfo();
	}

	private int getAirBagPrice() {
		return airBagPrice;
	}
	
	

}
