package design_pattern.strategy.attack;

public class PunchStrategy implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("I have strong punch and can attack with it.");
	}

}
