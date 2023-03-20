package algo0317;

import java.io.BufferedReader;
import java.io.IOError;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920_수찾기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 입력 받기- 원본 배열
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 입력 받기- 찾아야하는 수가 저장된 배열
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		int[] comp_arr = new int[m];
		for (int i = 0; i < m; i++) {
			comp_arr[i] = Integer.parseInt(st.nextToken());
		}

		// 이진 탐색은 정렬이 진행된 상태에서 해야하므로 sort를 통해 정렬 진행
		Arrays.sort(arr);

		for (int i = 0; i < m; i++) {
			boolean find = false;
			int start = 0;
			int end = arr.length - 1;
			while (start <= end) { //
				int mid = (start + end) / 2; //중간값 정하기
				if (comp_arr[i] < arr[mid]) {
					end = mid - 1;
				} else if (comp_arr[i] > arr[mid]) {
					start = mid + 1;
				} else {
					find = true;
					sb.append(1).append("\n");
					break;
				}
			}
			if (find == false)
				sb.append(0).append("\n");
		}
		System.out.println(sb);
	}

}
