package algo0316;

import java.util.ArrayList;

public class ExamArrayList {

	public static void main(String[] args) {

		//ArrayList, Wrapper클래스
		//wrapper 클래스 -> 기본 자료형(byte, short, int, long, float, double, boolean)
		//기본 자료형을 객체화 시킴 (자료구조에 저장하는 목적,형변환)
		//byte =>Byte, short->Short, int->Integer
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(100);
		arr.add(200);
		arr.add(300);
		
		System.out.println("저장개수 = " + arr.size());
		System.out.println("arr.get(1) = " + arr.get(1));// 1번 순번 추출
		System.out.println("arr.get(3) = " + arr.get(3));// 3번 순번 추출
		System.out.println("300의 위치 = "+ arr.indexOf(300));
		System.out.println("300의 위치 = "+ arr.indexOf(400));
		arr.remove(1);//1번 인덱스의 자료 삭제
		System.out.println("삭제 후 저장 갯수 = " + arr.size());
	}

}
