package java0302;

public class ExamArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] points;
		points = new int[3]; // 선언 생성, 할당
		System.out.println(points); // [I@3d012ddd : [는 배열 의미 I는 int, 뒤숫자는 해쉬값
		int[] points2;
		points2 = null; // 선언 생성, 할당
		System.out.println(points2);
		points[0] = 100;
		points[1] = 200;
		points[2] = 300;
		System.out.println(points);
		System.out.println(points[0]);

		for (int i = 0; i < points.length; i++) {
			System.out.println(points[i]);
		}

		String[] o = new String[3];
		System.out.println(o);
		String[] oldName = {"Java", "Python", "C"};//[Ljava.lang.String;@626b2d4a
		System.out.println(oldName);//[Ljava.lang.String;@5e91993f


	}

}
