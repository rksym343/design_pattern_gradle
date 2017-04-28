package design_pattern.composite.prac;

public abstract class FileComponent {
	private String name;
	private int depth = 0;

	public FileComponent(String name) {
		this.name = name;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public String getName() {
		return name;
	}

	public abstract int getSize();

	public abstract void print();
}
