package java_oop_0327;

import java.util.Random;

public class Exam가위바위보 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int rnd = r.nextInt(3);
		String[] arr = {"가위","바위","보"};
		System.out.println(arr[rnd]);

		
	}

}
