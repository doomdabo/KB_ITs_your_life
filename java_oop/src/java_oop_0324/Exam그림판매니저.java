package java_oop_0324;

import java.util.ArrayList;

public class Exam그림판매니저 {

	public static void main(String[] args) {
		// MyShapeManager: 도형 객체를 저장,검색,수정,삭제,리스트,갯수정보제공
		//등록
		MyShapeManager msm = new MyShapeManager();
		MyLine ml1 = new MyLine(3,3,5,5);
		msm.add(ml1);//선객체 저장
		//매니저 클래스 없다면
		//각 타입 별 리스트를 따로 만들어야함. 타입 별 개수 따로 관리
		//도형 검사할 때 타입 별 따로 검사
		ml1 = new MyLine(3,3,5,5);
		msm.add(ml1);//선객체 저장
		
		MyRect mr1 = new MyRect(5,5,5,5);
		msm.add(mr1);//선객체 저장
		
		MyCircle mc1 = new MyCircle(3,3,5);
		msm.add(mc1);
		int count = msm.getCount();

		//저장된 전체 객체의 정보를 출력
		msm.printAll();
		MyShape fbp = msm.findByPosition(3, 5);
		if(fbp == null) System.out.println("없음");
		else System.out.println("있음");
		//도형 여러개인 경우 출력 방식 
		ArrayList<MyShape> fbp2 = msm.findByPosition2(3, 5);
		if(fbp2.size() == 0 ) System.out.println("없음");
		else System.out.println("있음");

	}

}
