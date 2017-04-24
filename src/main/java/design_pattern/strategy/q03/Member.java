package design_pattern.strategy.q03;

public class Member {
	private String name;
	private int sum = 0;

	public Member(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void buy(Book book) {
		sum += book.getPrice();
	}
}
