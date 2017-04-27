package design_pattern.strategy.prac04;

public class DiagonalMoveStrategy2 extends DirectionStrategy {

	@Override
	public void move(Ball ball) {
		ball.setIntervals(Ball.INTERVAL, Ball.INTERVAL);
		while (true) {
			ball.setX(ball.getX() + ball.getxInterval());
			ball.setY(ball.getY() + ball.getyInterval());
			if ((ball.getX() < 0 && ball.getxInterval() < 0 && ball.getY() < 0 && ball.getyInterval() < 0)
					|| ball.getX() + ball.SIZE > BallFrame.WIDTH - 15 && ball.getxInterval() > 0 
					&& ball.getY() + ball.SIZE > BallFrame.HEIGHT - 40 && ball.getyInterval() > 0) {
				ball.setIntervals(-ball.getxInterval(), -ball.getyInterval());
			}
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
			}
		}
	}

}
