package algo0313;

import java.util.HashMap;

public class ExamHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection에는 크게 두가지 분류의 타입
		//1. collection (값만 저장)-순서지원:List, 미지원:Set
		//2. map 키와 값을 저장
		HashMap<String,Integer> scores = new HashMap<>();
		scores.put("홍", 902);
		scores.put("김", 903);
		scores.put("박", 901);
		System.out.println(scores);
		//검색 
		System.out.println(scores.get("강"));
		System.out.println(scores.getOrDefault("강", 0));//없으면
		//수정:put(K,V)
		//삭제
		scores.remove("홍");
		System.out.println(scores);
	}

}
