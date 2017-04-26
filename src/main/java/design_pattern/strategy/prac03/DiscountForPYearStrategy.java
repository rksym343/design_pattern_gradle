package design_pattern.strategy.prac03;

import java.util.Calendar;
import java.util.Date;

public class DiscountForPYearStrategy implements DiscountStrategy {
	// 출판년도가 10년 이상된 책 20%할인
	private double discountP = 0.2;

	@Override
	public int discountPrice(Buy buy) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		if ((year - buy.getTheBook().getpYear()) > 9) {
			System.out.println("출판년도 : "+buy.getTheBook().getpYear()+" / 현재년도 : " + year);
			System.out.println("할인된 가격"+ (int) (buy.getTheBook().getPrice() * (1 - discountP)));
			return (int) (buy.getTheBook().getPrice() * (1 - discountP));
			
		}
		System.out.println("정상 가격"+ (int) (buy.getTheBook().getPrice()));
		return buy.getTheBook().getPrice();
	}

}
