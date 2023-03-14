package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2750_수정렬하기_Bubble {
	private static <T> void swap(int[] a, int f, int r) {
		int temp;
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		//수 입력받기
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++) {
			for(int j = n-1;j>i;j--) {
				if(arr[j-1]>arr[j]) {
					swap(arr,j-1,j);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
