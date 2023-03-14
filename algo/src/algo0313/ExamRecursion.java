package algo0313;

public class ExamRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = factorial (5);
		System.out.println(ans);
	}

	private static int factorial(int i) {
		// TODO Auto-generated method stub
		if(i == 1) return 1;
		else {
			return i * factorial(i-1);
		}
	}

}
