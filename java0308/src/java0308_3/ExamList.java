package java0308_3;

import java.util.ArrayList;

public class ExamList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("cde");
		al.add("xyz");
		System.out.println(al.size());
		al.get(0);

		String e = al.get(2);
		System.out.println(e);

		String r = al.remove(1);
		System.out.println("지워진값: " + r);
		System.out.println(al.size());
		System.out.println(al);

		al.add(0, r);
		System.out.println(al);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

	}

}
