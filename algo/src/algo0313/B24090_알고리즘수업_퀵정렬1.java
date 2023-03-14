package algo0313;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B24090_알고리즘수업_퀵정렬1 {
	static int cnt = 0;
	static int k;

	private static void swap(int[] a, int f, int r) {
		int temp;
		temp = a[f];
		a[f] = a[r];
		a[r] = temp;
	}

	private static void quick_sort(int[] arr, int p, int r) {
		if (p < r) {
			int q = partition(arr, p, r); // 분할
			quick_sort(arr, p, q - 1); // 왼쪽 정렬
			quick_sort(arr, q + 1, r); // 오른쪽 정렬
		}
	}

	private static int partition(int[] arr, int p, int r) {
		int x = arr[r]; //맨 오른쪽 애가 피봇
		int i = p - 1; //더 큰 요소의 포인터
		for (int j = p; j < r; j++) {
			if (arr[j] <= x) { //만약 요소가 피봇보다 작으면 ++i랑 스왑
				i++;
				swap(arr, i, j);
				cnt++;
				if (cnt == k) {
					System.out.println(arr[i] + " " + arr[j]);
					return 0;
				}
			}
		}
		if (i + 1 != r) {
			swap(arr, i + 1, r);
			cnt++;
			if (cnt == k) {
				System.out.println(arr[i+1] + " " + arr[r]);
				return 0;
			}
		}
		return i + 1;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		cnt = 0;
		quick_sort(arr, 0, n - 1);
		if (k > cnt)
			System.out.println(-1);
	}

}
