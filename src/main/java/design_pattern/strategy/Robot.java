package design_pattern.strategy;

import design_pattern.strategy.attack.AttackStrategy;
import design_pattern.strategy.move.MoveStrategy;

public abstract class Robot {
	private String name;
	private AttackStrategy attackStrategy;
	private MoveStrategy movingStrategy;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAttackStrategy(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void setMovingStrategy(MoveStrategy movingStrategy) {
		this.movingStrategy = movingStrategy;
	}

	public void attack() {
		attackStrategy.attack();
	}

	public void move() {
		movingStrategy.move();
	}

}
