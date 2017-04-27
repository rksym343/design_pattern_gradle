package design_pattern.strategy.prac04;

public class VerticalMoveStrategy extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, 0);
		while (true) {
			ball.setY(ball.getY() + ball.getyInterval());
			if ((ball.getY() < 0 && ball.getyInterval() < 0)
					|| ball.getY() + ball.SIZE > BallFrame.WIDTH - 15 && ball.getyInterval() > 0) {
				ball.setIntervals(-ball.getyInterval(), 0);
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}

}
