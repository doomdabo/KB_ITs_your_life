package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2750_수정렬하기_Selection {
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
			int min = i; //아직 정렬되지 않은 부분에서 가장 작은요소의 인덱스 저장
			for(int j = i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr,i,min);
		}
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
	}

}
