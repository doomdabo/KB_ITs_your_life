package java0307;

public class ExamString2 {
	public static void main(String[] args) {
		String s1 = new String("Hello Java");
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf("ava"));
		System.out.println(s1.replace("H", "M"));
		System.out.println(s1.substring(6, 8));
		System.out.println("   abc 123   ".trim() + "*");

	}
}
