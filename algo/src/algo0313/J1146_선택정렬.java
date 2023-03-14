package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J1146_선택정렬 {
	private static void swap(int[] a, int f, int r) {
		int temp;
	    temp = a[f];
	    a[f] = a[r];
	    a[r] = temp;
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		//수 입력받기
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		for(int i=0;i<n-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<n;j++) 
				if(arr[j]<arr[min_idx]) 
					min_idx = j;
			swap(arr,i,min_idx);
			for(int k=0;k<n;k++)
				System.out.print(arr[k]+" ");
			System.out.println();
		}

	}

}
