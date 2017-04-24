package design_pattern.strategy.q03;

public class Buy {
	private Book theBook;
	private Member theMember;
	private DiscountStrategy discountStrategy;

	public Buy() {
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public void setTheBook(Book theBook) {
		this.theBook = theBook;
	}

	public void setTheMember(Member theMember) {
		this.theMember = theMember;
	}

	public void buy() {
		theMember.buy(discountStrategy.discountPrice(this));
	}

	public Book getTheBook() {
		return theBook;
	}

	public Member getTheMember() {
		return theMember;
	}
}
