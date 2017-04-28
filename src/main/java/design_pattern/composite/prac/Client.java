package design_pattern.composite.prac;

public class Client {
	public static void main(String[] args) {
		Directory dir0 = new Directory("root");
		Directory dir1 = new Directory("Dir1");
		Directory dir2 = new Directory("Dir2");

		File f1 = new File("dir0> f1", 100);
		File f2 = new File("dir0> f2", 200);
		File f3 = new File("dir0> f3", 300);
		File f4 = new File("dir0> f4", 400);
		
		File f5 = new File("dir1> f5", 400);
		File f6 = new File("dir2> f6", 400);
		File f7 = new File("dir2> f7", 400);

		dir0.addEntry(f1);
		dir0.addEntry(dir1);
		dir0.addEntry(f2);
		dir0.addEntry(f3);
		dir0.addEntry(f4);
		
		dir1.addEntry(f5);
		dir1.addEntry(dir2);
		dir2.addEntry(f6);
		dir2.addEntry(f7);
		
		dir0.print();
		System.out.println("==========");

	}
}
