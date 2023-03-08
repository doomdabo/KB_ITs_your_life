package java0308_2;

public class ExamMath {

	public static void main(String[] args) {
		double random = Math.random();
		System.out.println(random);
		// r:0.0~0.99999
		random *= 100; // 0.0~99.9999
		System.out.println(random);
		// 정수로 변환 0~99
		int i = (int) random + 1;
		System.out.println(i);
	}

}
