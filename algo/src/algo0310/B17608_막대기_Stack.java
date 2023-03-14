package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class B17608_막대기_Stack {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		Stack<Integer> stack = new Stack<>();
		// 입력 받기
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			stack.push(arr[i]);
		}
		int cnt = 1;// 맨뒤에 거는 무조건 보이므로 1에서 시작
		int criteria = stack.pop(); // 우선 맨 위의 값을 기준값으로 지정

		while (!stack.isEmpty()) { // 스택의 모든 원소를 확인
			if (stack.peek() > criteria) { // 기준보다 더 큰값이 나타나면
				cnt++; // 카운트를 하나 증가하고
				criteria = stack.peek();// 그걸로 기준을 변경
			}
			stack.pop(); // 스택에서 확인한 원소 제거
		}
		System.out.println(cnt);
	}
}