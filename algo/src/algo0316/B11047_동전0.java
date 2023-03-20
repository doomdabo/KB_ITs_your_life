package algo0316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11047_동전0 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];

		for(int i = 0; i<n;i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
		}
		int ans = 0;
		for(int i = n-1;i>=0;i--) {
			if(arr[i]<=k) {
				ans+=k/arr[i];
				k %= arr[i];
			}
		}
		System.out.println(ans);
		
	}

}
