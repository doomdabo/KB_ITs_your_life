package _2주차;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class HW2_J1828_권보경 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		int [][] arr = new int[n][2];
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}
		//최고온도 오름차순으로 정렬
		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[1],o2[1]);
			}
		});
		int ans = 1;
		int mx = arr[0][1];
		for(int i =1 ;i<n;i++) {
			if(arr[i][0]>mx) {
				mx = arr[i][1];
				ans++;
			}
		}
		System.out.println(ans);
		
	}
	

}
