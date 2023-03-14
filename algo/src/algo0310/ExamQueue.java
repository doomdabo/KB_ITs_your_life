package algo0310;

import java.util.LinkedList;
import java.util.Queue;

public class ExamQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q = new LinkedList<>();
		q.offer(100);
		q.offer(200);
		q.offer(300);
		q.offer(400);
		q.offer(500);
		int front = q.poll();
		System.out.println("front = "+front);
		System.out.println("queue = "+q);
		System.out.println("peek = "+q.peek());
		while(!q.isEmpty()) {
			q.poll();
			System.out.println("queue = "+q);
		}
		
	}

}
