package algo0310;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B12891_DNA비밀번호 {
	static int[] checkPw = new int[4];
	static int[] currentPw = new int[4];
	static char[] str;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		// 정보 입력받기
		int s = Integer.parseInt(st.nextToken());
		int p = Integer.parseInt(st.nextToken());

		str = br.readLine().toCharArray();

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			checkPw[i] = Integer.parseInt(st.nextToken());
		}

		int cnt = 0;
		int idx = -1;

		for (int i = 0; i < p; i++) { // 맨처음 슬라이딩 윈도우 초기화
			if (str[i] == 'A')
				currentPw[0]++;
			else if (str[i] == 'C')
				currentPw[1]++;
			else if (str[i] == 'G')
				currentPw[2]++;
			else if (str[i] == 'T')
				currentPw[3]++;
		}
		if (checkAns() == 1)
			cnt++;

		for (int i = 0; i < s - p; i++) { // p=8, s=9라면 0 p=4, s=9라면 0,1,2,3,4
			idx = i; // 이전 부분해답의 시작 -> 빠질 부분
			if (str[idx] == 'A')
				currentPw[0]--;
			else if (str[idx] == 'C')
				currentPw[1]--;
			else if (str[idx] == 'G')
				currentPw[2]--;
			else if (str[idx] == 'T')
				currentPw[3]--;
			idx = i + p; // 추가될 부분의 인덱스 업데이트
			// 이후 추가된 부분이 DNA문자열에 해당하는지 확인후 값 업데이트
			if (str[idx] == 'A')
				currentPw[0]++;
			else if (str[idx] == 'C')
				currentPw[1]++;
			else if (str[idx] == 'G')
				currentPw[2]++;
			else if (str[idx] == 'T')
				currentPw[3]++;
			if (checkAns() == 1)
				cnt++;
		}
		System.out.println(cnt);
	}

	// DNA 개수가 조건을 만족하는지 확인
	public static int checkAns() {
		for (int i = 0; i < 4; i++) {
			if (currentPw[i] < checkPw[i]) {
				return 0; // 정답아님
			}
		}
		return 1; // 정답
	}

}
