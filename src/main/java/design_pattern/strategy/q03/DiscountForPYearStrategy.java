package design_pattern.strategy.q03;

import java.util.Calendar;
import java.util.Date;

public class DiscountForPYearStrategy implements DiscountStrategy {
	// 출판년도가 10년 이상된 책 20%할인
	private double discountP = 0.2;

	@Override
	public int discountPrice(Book book) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		if ((year - book.getpYear()) > 9) {
			return (int) (book.getPrice() * (1 - discountP));
		}
		return book.getPrice();
	}

}