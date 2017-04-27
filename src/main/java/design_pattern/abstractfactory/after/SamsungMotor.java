package design_pattern.abstractfactory.after;

public class SamsungMotor extends Motor {

	@Override
	protected void moveMotor(Direction direction) {
		String strDriection = direction == Direction.UP?"위로":"아래로";
		System.out.printf("[ %s 모터 ] [%s] 이동중%n", "Samsung", strDriection);
	}

}
