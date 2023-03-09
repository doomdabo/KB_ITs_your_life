package java0303;

public class ExamArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = null; //선언
		System.out.println(arr);
		arr = new int[3];
		
		int[] arr2 = new int[3]; //초기화 - new(메모리 할당 연산자) 하면 시작 주소 반환
		System.out.println(arr2);
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		System.out.println("arr2의 길이 : "+ arr2.length);
	}

}
