package design_pattern.ch02.check01;

public class StackClient {

	public static void main(String[] args) {
		ArrayStack st = new ArrayStack(10);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		st.push(7);
		st.push(8);
		st.push(9);
		st.push(0);
		st.push(2);
		st.push(2);
		st.push(2);

		st.peek();
		System.out.println(st);

		st.pop();
		System.out.println(st);

		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();
		st.pop();

		System.out.println(st);
	}

}
