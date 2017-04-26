package design_pattern.strategy.prac03;

public class Member {
	private String name;
	private int sum = 0;

	public Member(String name) {
		this.name = name;
	}

	public int getSum() {
		return sum;
	}

	public void buyItem(int price) {
		sum += price;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return String.format("Member [name=%s, sum=%s]", name, sum);
	}

}
