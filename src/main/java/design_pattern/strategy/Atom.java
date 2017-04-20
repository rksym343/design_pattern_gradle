package design_pattern.strategy;

public class Atom extends Robot{

	public Atom(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println("I hava strong punch and can attack with it.");
	}

	@Override
	public void move() {
		System.out.println("I can fly");
	}

}
