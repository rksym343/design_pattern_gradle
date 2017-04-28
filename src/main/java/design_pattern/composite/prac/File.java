package design_pattern.composite.prac;

public class File extends FileComponent {
	private int size;

	public File(String name, int size) {
		super(name);
		this.size = size;
	}

	@Override
	public int getSize() {
		return size;
	}

	public void print() {
		for (int i = 0; i < getDepth(); i++)
			System.out.printf("\t");
		System.out.println("[File] " + getName() + ", Size: " + size);

	}

}
