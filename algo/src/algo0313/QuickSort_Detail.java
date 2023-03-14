package algo0313;

import java.util.Arrays;

//퀵 정렬

import java.util.Scanner;
// 백준 24090 퀵정렬 프린트 버전 
public class QuickSort_Detail {
    // --- 배열 요소 a[idx1]와 a[idx2]의 값을 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        System.out.println("a["+idx1+"]:"+a[idx1]+" <-> a["+idx2+"]:"+a[idx2]);
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // --- 퀵 정렬 ---//
    static void quickSort(int[] a, int left, int right) {
        int pl = left; // 왼쪽 커서
        int pr = right; // 오른쪽 커서
//     int x = a[(pl + pr) / 2];        // 피벗(가운데 요소)
        int x = a[pr]; // 피벗(맨우측 요소)

        System.out.print("범위: a["+left+"] ~ a["+right+"] ");
        for (int i = left; i < right; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        do {
            while (a[pl] < x) // pl<=right && 
                pl++;
            while (a[pr] > x) // left<=pr && 
                pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr)
            quickSort(a, left, pr);
        if (pl < right)
            quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int N = stdIn.nextInt();
        int K = stdIn.nextInt();
        int[] x = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = stdIn.nextInt();
        }

        quickSort(x, 0, N - 1); // 배열 x를 퀵정렬
        System.out.println( Arrays.toString(x) );
//     for (int i = 0; i < N; i++)
//         System.out.println("x[" + i + "]=" + x[i]);
    }
}

