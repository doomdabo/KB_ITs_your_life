package java0302;

public class ExamFor {
	public static void main(String[] args) {
		System.out.println("***99단***");

		for (int i = 2; i <= 9; i++) {
			System.out.println("**" + i +"단 입니다.**");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
		}//end for dan 
	}
}
