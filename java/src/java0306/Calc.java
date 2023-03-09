package java0306;

public class Calc {

	public Calc() {
		System.out.println("생성스");
	} //기본 생성자 - by compiler
	public int plus(int i, int j) {
		return i+j;
	}
	
	public int minus(int i, int j) {
		return i-j;
	}
	public double divide(double i, double j) {
		return i/j;
	}

}
