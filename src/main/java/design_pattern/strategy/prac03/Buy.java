package design_pattern.strategy.prac03;

public class Buy {
	private Book theBook;
	private Member theMember;
	private DiscountStrategy discountStrategy;
	private int cnt;

	

	public Buy(Book theBook, Member theMember, DiscountStrategy discountStrategy, int cnt) {
		this.theBook = theBook;
		this.theMember = theMember;
		this.discountStrategy = discountStrategy;
		this.cnt = cnt;
	}

	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public void buyItem() {
		theMember.buyItem(discountStrategy.discountPrice(this)*cnt);
	}

	public Book getTheBook() {
		return theBook;
	}

	public Member getTheMember() {
		return theMember;
	}
}
