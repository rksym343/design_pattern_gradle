package design_pattern.composite.prac;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileComponent {
	private List<FileComponent> entries = new ArrayList<>();

	public Directory(String name) {
		super(name);
	}

	public void addEntry(FileComponent entry) {
		entry.setDepth(entry.getDepth() + 1);
			
		entries.add(entry);

	}

	public void removeEntry(Object entry) {
		entries.remove(entry);
	}
	
	

	public List<FileComponent> getEntries() {
		return entries;
	}

	@Override
	public int getSize() {
		int size = 0;
		for (FileComponent entry : entries) {
			size += entry.getSize();
		}
		return size;
	}

	public void print() {
		for (int i = 0; i < getDepth(); i++)
			System.out.printf("\t");

		System.out.println("[Directory] " + getName() + ", Size: " + getSize());

		for (FileComponent entry : entries) {

			entry.print();
		}

	}
}
