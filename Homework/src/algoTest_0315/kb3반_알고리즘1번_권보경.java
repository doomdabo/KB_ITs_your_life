package algoTest_0315;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class kb3반_알고리즘1번_권보경 {

	private static void swap(int[] a, int f, int r) {
		int temp; 
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
//		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		//수 입력받기
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		for(int i=0;i<n-1;i++) {
			int max_idx = i;
			for(int j=i+1;j<n;j++) 
				if(arr[j]>arr[max_idx]) //내림차순 -> 최댓값 찾기 
					max_idx = j;
			swap(arr,i,max_idx);

		}
		for(int k=0;k<n;k++)
			System.out.println(arr[k]);
	}

}
