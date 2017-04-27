package design_pattern.strategy.prac04;

import java.awt.Color;

public class RedDrawStrategy extends DrawStrategy {

	@Override
	public void draw(Ball ball) {
		ball.setColor(Color.RED);
	}

}
