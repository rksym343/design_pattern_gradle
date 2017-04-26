package design_pattern.strategy.prac03;

public class TestMain {
	
	
	public static void main(String[] args) {
		Book book = new Book("책제목", 2014, 12000);
		Member member = new Member("m1");
		DiscountStrategy discountStrategy = new DiscountForSumStrategy();
		
		Buy buy1 = new Buy(book, member, discountStrategy, 1);
		printData(buy1);
		
		
		member.setSum(12000);
		printData(buy1);
		
		
		System.out.println("----------------------------------");
		buy1.setDiscountStrategy(new DiscountForPYearStrategy());
		printData(buy1);
		
		System.out.println("----------------------------------");
		
		Book book2 = new Book("책제목", 2000, 12000);
		Member member2 = new Member("m2");
		DiscountStrategy discountStrategy2 = new DiscountForPYearStrategy();
		
		
		Buy buy2 = new Buy(book2, member2, discountStrategy2, 3);
		printData(buy2);
		
	}
	
	
	public static void printData(Buy buy){
		System.out.println("============"+buy.getTheMember()+"============");
		buy.buyItem();
		System.out.println("누적금액 : "+buy.getTheMember().getSum());
	}
}
