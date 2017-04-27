package design_pattern.strategy.prac04;

import java.awt.Color;

public class BlueDrawStrategy extends DrawStrategy {

	@Override
	public void draw(Ball ball) {
		ball.setColor(Color.BLUE);
	}

}
