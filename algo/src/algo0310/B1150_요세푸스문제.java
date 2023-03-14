package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1150_요세푸스문제 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		Queue<Integer> q = new LinkedList<>();
		//큐에 원소 저장
		for(int i=1;i<=n;i++) {
			q.offer(i);
		}
		sb.append("<");
		
		while(q.size()!=1) {
			for(int i=0;i<k-1;i++) {
				q.offer(q.poll()); //맨앞 k-1개 빼서 뒤로 push
			}
			sb.append(q.poll()+", "); //한명 죽이기
		}
		sb.append(q.poll()+">"); //마지막원소 출력
		System.out.println(sb);
	}

}
