package alone;

import java.io.*;
import java.util.*;

import javax.print.attribute.IntegerSyntax;

public class B1931_회의실배정 {
//0320 연습삼아 다시 풀어보았음
	// dp
	static int[][] arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		//수 입력받기
		arr = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		//종료시간을 기준으로 정렬하기
		Arrays.sort(arr, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if(o1[1]==o2[1]) 
					return o1[0] - o2[0];
				return o2[1]-o2[1];
			}
			
		});
		
		int cnt = 0;
		int end = -1;
		for(int i = 0;i<n;i++) {
			if(end<=arr[i][0]) {
				end = arr[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
