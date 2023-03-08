package java0308_2;

public class ExamTypeCasting {
	public static void main(String[] args) {
		byte b = (byte) 200; // 127~-128
		System.out.println(b);// -56 //11001000
		short sh = b;
		b = (byte)sh;
		
		char c = '가';
		int i = c;//int 32bit char 16bit이라 묵시적 형변환
		//boolean은 형변환ㄴ
		
	}
}
