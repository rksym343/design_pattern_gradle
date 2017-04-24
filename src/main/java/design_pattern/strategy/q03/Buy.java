package design_pattern.strategy.q03;

public class Buy {
	private Book theBook;
	private Member theMember;
	private DiscountStrategy discountStrategy;

	public Buy(Book theBook, Member theMember) {
		this.theBook = theBook;
		this.theMember = theMember;
	}

	public Book getTheBook() {
		return theBook;
	}

	public Member getTheMember() {
		return theMember;
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	

}
