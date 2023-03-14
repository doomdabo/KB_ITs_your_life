package algo0310;

import java.util.Stack;

public class ExamStack {

	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(100);
		st.push(200);
		st.push(300);
		st.push(400);
		st.push(500);
		Integer top = st.pop();
		System.out.println("top : " + top);
		System.out.println("Stack :" + st);
		System.out.println("peek: " + st.peek());
		while(!st.empty()) {
			st.pop();
			System.out.println(st);
		}
	}

}
