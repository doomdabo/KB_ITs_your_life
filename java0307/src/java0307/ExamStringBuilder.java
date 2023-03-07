package java0307;

public class ExamStringBuilder {

	public static void main(String[] args) {
		String s = "0123456789";
		String s1 = s;
		long start = System.currentTimeMillis();
		for (int i = 0; i < 5000; i++) {
			s1 += s;
		}
		long end = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end - start));
		
		
		long start2 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("0123456789");
		for (int i = 0; i < 5000; i++) {
			sb.append(s);
		}
		String s2 = sb.toString();
		long end2 = System.currentTimeMillis();
		System.out.println("걸린시간 : " + (end2 - start2));
		
		//StringBuffer sbf = new StringBuffer("0123456789");
	}

}
