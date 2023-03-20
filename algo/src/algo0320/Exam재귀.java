package algo0320;

public class Exam재귀 {

	public static void main(String[] args) {
		int sum = sumRecursive(1, 10);
		System.out.println(sum);
		int sum2 = sumRecursive2(10);
		System.out.println(sum2);
		int sum3 = sumRecursive3(5);
		System.out.println(sum3);
		int sum4 = sumRecursive4(6, 3, 0);
		System.out.println(sum4);
	}

	private static int sumRecursive4(int end, int i, int e_or_o) {

		if (end==0)
			return 0;
		if (end % i == e_or_o)
			return end + sumRecursive4(end - 1, i, e_or_o);
		return sumRecursive4(end - 1, i, e_or_o);

	}

	private static int sumRecursive3(int i) {
		if (i == 0)
			return 0;
		if (i % 2 == 0)
			return i + sumRecursive3(i - 1);
		else
			return sumRecursive3(i - 1);
	}

	private static int sumRecursive2(int i) {
		if (i == 0)
			return 0;
		return i + sumRecursive2(i - 1);
	}

	private static int sumRecursive(int start, int end) {
		if (start == end)
			return start;
		return start + sumRecursive(start + 1, end);

	}

}
