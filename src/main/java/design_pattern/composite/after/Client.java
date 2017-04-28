package design_pattern.composite.after;

public class Client {
	public static void main(String[] args) {
		Body body = new Body(100, 70);
		Keyboard keyboard = new Keyboard(5, 2);
		Monitor monitor = new Monitor(20, 30);
		Speaker speaker = new Speaker(100, 300);

		Computer computer = new Computer();
		computer.addComponent(body);
		computer.addComponent(keyboard);
		computer.addComponent(monitor);
		computer.addComponent(speaker);
		
		Computer computer2 = new Computer();
		computer2.addComponent(body);
		computer2.addComponent(keyboard);
		computer2.addComponent(monitor);
		computer2.addComponent(speaker);
		computer2.addComponent(computer);

		System.out.println(computer2);
	}
}
