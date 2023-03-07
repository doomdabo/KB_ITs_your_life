package java0306;

public class ExamCall {

	public static void main(String[] args) {
		int a = 100;
		change(a); // a에 저장된 값이 복사돼서 전달
		System.out.println("a = " + a);

		int[] arr = new int[] { 100, 200, 300 };
		change2(arr);
		System.out.println("arr[1] = " + arr[1]);
	}

	private static void change2(int[] arr) {
		arr[1] = 900;
	}

	private static void change(int a) { // 스택에 a가 생김
		a = 200;
	}

}
