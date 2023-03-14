package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Stack;

public class B17608_막대기 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n];
		//입력 받기
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int cnt = 1;//맨뒤에 거는 무조건 보이므로 1에서 시작
		int temp = arr[n - 1]; //맨 뒤에 있는 원소부터 검사
		for (int i = n - 1; i >= 0; i--) {
			if (temp < arr[i]) {
				cnt++;
				temp = arr[i]; //최댓값을 갱신해줘야함
			}
		}
		System.out.println(cnt);
	}

}

