package algo0314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B15650_N과M2 {
    private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리
    static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken()); //전체 숫자 갯수
		m = Integer.parseInt(st.nextToken()); //선택 숫자 갯수
		
		arr = new int[m]; //선택 숫자 저장용
		combination(0,1); //글자 몇개 선택했는지, 시작숫자 번호
		System.out.println(sb);
	}
	private static void combination(int cnt, int start) {
		// TODO Auto-generated method stub
		if(cnt == m) { //m개를 다 골랐으면
			for(int i=0;i<m;i++) {
				sb.append(arr[i]).append(" ");
			}
			sb.append("\n");
			return;
		}
		else {
			for(int i=start;i<=n;i++) {
				arr[cnt] = i;//cnt번째에 i 저장. i는 start부터 n까지 들어감
				combination(cnt+1, i+1);//오름차순으로 구하면 중복체크 하지 않아도 됨
				//cnt+1은 다음 자릿수 결정한다는 의미
				//i+1은 오름차순이므로 앞자리 숫자보다 무조건 1이상 커야함을 의미
			}
		}
	}

}
