package design_pattern.strategy;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import design_pattern.strategy.attack.MissileStrategy;
import design_pattern.strategy.attack.PunchStrategy;
import design_pattern.strategy.attack.RazerStaregy;
import design_pattern.strategy.move.FlyingStrategy;
import design_pattern.strategy.move.WalkingStrategy;

public class TestStrategy {

	@Test
	public void testRobot() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");

		taekwonV.setMovingStrategy(new WalkingStrategy());
		taekwonV.setAttackStrategy(new MissileStrategy());

		atom.setMovingStrategy(new FlyingStrategy());
		atom.setAttackStrategy(new PunchStrategy());

		prnRobot(taekwonV);
		prnRobot(atom);
		
		Robot sungard = new Sungard("SunGard");
		sungard.setMovingStrategy(new FlyingStrategy());
		sungard.setAttackStrategy(new MissileStrategy());
		sungard.setAttackStrategy(new RazerStaregy());
		prnRobot(sungard);

	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
	}
	
	@Test
	public void testYear() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
	}
	

}
