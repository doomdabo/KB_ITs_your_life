package java_oop_0327;

public class Exam예외2 {
	public static void main(String[] args) {

		int[] arr = {1,3,5};
		System.out.println("arr[3] = " + arr[3]);
		System.out.println("OK");
		
		int[] arr2 = null;
		if(arr2!=null)
			System.out.println(arr2.length);
		
	}
}
