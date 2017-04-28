package design_pattern.strategy.prac04;

public class VerticalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(0, Ball.INTERVAL);
		while (true) {
			ball.setY(ball.getY() + ball.getyInterval());
			if ((ball.getY() < 0 && ball.getyInterval() < 0)
					|| ball.getY() + ball.SIZE > BallFrame.HEIGHT - 20 && ball.getyInterval() > 0) {
				ball.setIntervals(0, -ball.getyInterval());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}

}
