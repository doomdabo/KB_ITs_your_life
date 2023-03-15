package algo0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2775_부녀회장이될테야 {
	static int t,k,n;
	static int[][] d;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		d = new int[15][15];
		t = Integer.parseInt(st.nextToken());
		
		for(int i=0;i<15;i++) {
			d[0][i] = i;
			d[i][1] = 1;
		}
		for(int i=1;i<15;i++) {
			for(int j=2;j<15;j++) {
				d[i][j] = d[i][j-1]+d[i-1][j];
			}
		}
		for(int i=0;i<t;i++) {
			k = Integer.parseInt(br.readLine());;
			n = Integer.parseInt(br.readLine());
			System.out.println(d[k][n]);
		}
		
	}

}
