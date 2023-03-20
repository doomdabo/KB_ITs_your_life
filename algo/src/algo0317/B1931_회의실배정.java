package algo0317;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class B1931_회의실배정 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int[][] time = new int[n][2];
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken()); // 시작시간
			time[i][1] = Integer.parseInt(st.nextToken()); // 종료시간
		}

		// 끝나는 시간을 기준으로 정렬. 이때 종료 시간이 같으면 시작 시간을 기준으로 정렬
		Arrays.sort(time,new Comparator<int[]>(){

			@Override
			public int compare(int[] o1, int[] o2) {
				if(o1[1]==o2[1]) return o1[0]-o2[0];
				return o1[1]-o2[1];
			}
		});
		int count = 0;
		int end = -1;
		for(int i = 0; i<n;i++) {
			if(time[i][0]>=end) {
				end = time[i][1];
				count++;
			}
		}
		System.out.println(count);
	}
}
