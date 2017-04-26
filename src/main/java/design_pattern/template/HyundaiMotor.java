package design_pattern.template;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	@Override
	protected void moveMotor(Direction direction) {
		String strDriection = direction == Direction.UP ? "위로" : "아래로";
		System.out.printf("현대 모터 [%s] 이동중...\n", strDriection);
	}

}
