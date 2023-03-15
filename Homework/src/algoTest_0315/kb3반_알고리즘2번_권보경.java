package algoTest_0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb3반_알고리즘2번_권보경 {
	static int n, m, max, sum;
	static int[] arr , input_arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		/*변수 선언 및 입력받기*/
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		input_arr = new int[n];
		visited = new boolean[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			input_arr[i] = Integer.parseInt(st.nextToken());
		}

		//nC3을 통해 각 조합의 합을 구함. 
		func(0);
		System.out.println(max);
	}
	static void func(int k) { //숫자 3개 선택
		if (k == 3) {
			sum = 0;
			for (int i = 0; i < 3; i++) {
				sum += arr[i]; //temp에 3개 숫자의 합 저장
			}
			if(sum>max && sum<=m) { //기존 max보다 크고, 만약 합이 m 이하라면 max갱신
				max = sum;
			}
			
		} else {
			for (int i = 0; i < n; i++) {
				if (!visited[i]) {
					visited[i] = true;
					arr[k] = input_arr[i];
					func(k + 1);
					visited[i] = false;
				}
			}
		}
	}
}
