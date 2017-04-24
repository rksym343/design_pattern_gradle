package design_pattern.strategy.q03;

public class TestMain {
	
	
	public static void main(String[] args) {
		Book book = new Book("책제목", 2014, 12000);
		Member member = new Member("m1");
		
		
		Buy buy1 = new Buy();
		buy1.setTheBook(book);
		buy1.setTheMember(member);
		buy1.setDiscountStrategy(new DiscountForSumStrategy());
		
		
		printData(buy1);
		
		
		member.setSum(12000);
		printData(buy1);
		
		
		System.out.println("----------------------------------");
		buy1.setDiscountStrategy(new DiscountForPYearStrategy());
		printData(buy1);
		
		System.out.println("----------------------------------");
		
		Book book2 = new Book("책제목", 2000, 12000);
		Member member2 = new Member("m2");
		
		
		Buy buy2 = new Buy();
		buy2.setTheBook(book2);
		buy2.setTheMember(member2);
		buy2.setDiscountStrategy(new DiscountForPYearStrategy());
		printData(buy2);
		
	}
	
	
	public static void printData(Buy buy){
		System.out.println("============"+buy.getTheMember()+"============");
		buy.buy();
		
	}
}
