package java02;

public class ExamArr4 {

	public static void main(String[] args) {
		//가변 배열
		int [][] arr = new int[3][];
		arr[0] = new int[2];
		arr[1] = new int[3];
		arr[2] = new int[4];//처음 초기화시 0으로 
		
		int [][] arr2 = new int[3][];
		arr2[0] = new int[] {10,20};
		arr2[1] = new int[] {3,4,5};
		arr2[2] = new int[] {6,7,8,9};
	}

}
