package design_pattern.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy {

	@Test
	public void testRobot() {
		Robot taekwonV = new TaekwonV("TaekwonV");
		Robot atom = new Atom("Atom");
		
		prnRobot(taekwonV);
		prnRobot(atom);
		
	}

	private void prnRobot(Robot robot) {
		System.out.printf("My name is %s%n", robot.getName());
		robot.move();
		robot.attack();
	}

}
