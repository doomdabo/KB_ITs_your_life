package java01;

public class ExamString {
	public static void main(String[] args) {
		String s1 = new String("HELLO"); //Heap에 생성
		String s2 = "HELLO";//string literal(static - memory overflow 조심) - class에 생성 
		String s3 = "HELLO";//s2==s3
		String s4 = new String("HELLO"); //s1이랑 다름

	}
}
