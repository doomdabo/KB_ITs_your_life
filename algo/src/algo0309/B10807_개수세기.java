package algo0309;

import java.util.Scanner;

public class B10807_개수세기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = 0;
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int v = sc.nextInt();
		for(int i=0;i<n;i++) {
			if(arr[i]==v) {
				result++;
			}
		}
		System.out.println(result);
	}

}
