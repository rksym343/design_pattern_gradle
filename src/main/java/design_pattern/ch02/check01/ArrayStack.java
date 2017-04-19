package design_pattern.ch02.check01;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayStack {
	private ArrayList<Integer> itemArray;
	private int stacksize;

	public ArrayStack(int stacksize) {
		super();
		itemArray = new ArrayList<>(stacksize);
		this.stacksize = stacksize;
	}

	public void push(int item) {
		if (isFull()) {
			System.out.println("공간이 다 참!");
		} else {
			itemArray.add(item);
			System.out.println("[ " + item + " ] 아이템 추가 ");
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("아무것도 없음");
			return -1;
		} else {
			int res = itemArray.get(itemArray.size() - 1);
			itemArray.remove(itemArray.size() - 1);
			System.out.println(res + "지움");
			return res;
		}
	}

	public int peek() {
		if (isEmpty()) {
			System.out.println("아무것도 없음");
			return -1;
		} else {
			int res = itemArray.get(itemArray.size() - 1);
			System.out.println(res);
			return res;
		}
	}

	public boolean isEmpty() {
		return itemArray.isEmpty();
	}

	public boolean isFull() {
		if (itemArray.size() == stacksize) {
			return true;
		}
		return false;

	}

	@Override
	public String toString() {
		return String.format("ArrayStack [itemArray=%s, stacksize=%s]", itemArray, stacksize);
	}
	
	
}
