package java0303;

import java.io.File;

public class ExamFile {
	public static void main(String[] args) {
		File f = new File("."); // . - cd
		System.out.println(f.getAbsolutePath());
		String[] list = f.list();
		for (String string : list) {
			System.out.println(string);
		}
	}
}
