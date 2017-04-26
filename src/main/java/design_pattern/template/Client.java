package design_pattern.template;

public class Client {
	public static void main(String[] args) {
		Door door = new Door();
		Motor hMotor = new HyundaiMotor(door);
		System.out.println(hMotor);
		hMotor.move(Direction.UP);
		System.out.println(hMotor);
		
		System.out.println("=========================");
		
		Door ldoor = new Door();
		Motor lgMotor = new LGMotor(ldoor);
		System.out.println(lgMotor);
		lgMotor.move(Direction.UP);
		System.out.println(lgMotor);
	}
}
