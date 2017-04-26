package design_pattern.strategy.prac03;

public class DiscountForSumStrategy implements DiscountStrategy {
	// 회원 누적 대여금액 만원 이상일시 10%할인
	private double discountP = 0.1;

	@Override
	public int discountPrice(Buy buy) {
		if (buy.getTheMember().getSum() > 9999) {
			System.out.println("할인된 가격" + (int) (buy.getTheBook().getPrice() * (1 - discountP)));
			return (int) (buy.getTheBook().getPrice() * (1 - discountP));
		}
		System.out.println("정상 가격" + buy.getTheBook().getPrice());
		return buy.getTheBook().getPrice();
	}
}
