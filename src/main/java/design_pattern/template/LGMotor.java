package design_pattern.template;

public class LGMotor extends Motor {

	public LGMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		String strDriection = direction == Direction.UP ? "위로" : "아래로";
		System.out.printf("lg 모터 [%s] 이동중...\n", strDriection);
	}

}
