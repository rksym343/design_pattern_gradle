package design_pattern.strategy.prac03;

public class Book {
	private String bookName;
	private int pYear;
	private int price;

	public Book(String bookName, int pYear, int price) {
		this.bookName = bookName;
		this.pYear = pYear;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public int getpYear() {
		return pYear;
	}

}
