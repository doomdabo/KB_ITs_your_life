package algo0314;

import java.util.Arrays;

public class 연속된숫자의조합_재귀 {
    private static int n, m;
    private static int[] arr; // 원소를 저장할 배열
    private static boolean[] visited; // 중복을 제거하기 위한 방문 처리

    public static void main(String[] args) {
        n = 4; // 전체숫자갯수
        m = 2; // 선택숫자갯수
        arr = new int[m]; //선택숫자저장용
        visited = new boolean[n + 1];
        combination(0, 1);
    }
    // 조합
    private static void combination(int cnt, int start) {
        if (cnt == m) {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = start; i <= n; i++) {
            arr[cnt] = i;
            combination(cnt + 1, i + 1); // 오름차순으로 구하면 중복 체크하지 않아도 됨
        }
    }


}