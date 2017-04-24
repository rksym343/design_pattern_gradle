package design_pattern.strategy.q03;

public class DiscountForSumStrategy implements DiscountStrategy{
	// 회원 누적 대여금액 만원 이상일시  10%할인
	private double discountP = 0.1;

	@Override
	public int discountPrice(Book book) {
		
		if ((year - book.getpYear()) > 9) {
			return (int) (book.getPrice() * (1 - discountP));
		}
		return book.getPrice();
	} 
}
