package java_oop_0324;

import java.util.ArrayList;

public class MyShapeManager {

	private ArrayList<MyShape> arr = new ArrayList<>();

	public void add(MyLine ml1) {
		arr.add(ml1);
	}
	public void add(MyRect ml1) {
		arr.add(ml1);
	}
	public int getCount() {
		return arr.size();
	}
	public void add(MyCircle mc1) {
		arr.add(mc1);		
	}
	public void printAll() {
		System.out.println("**전체 출력**");
		for(MyShape myShape : arr) 
			System.out.println(myShape.toString());
		
	}

	public MyShape findByPosition(int x1,int y1) {
		for(MyShape myShape : arr) {
			if(myShape.getX1()==x1&&myShape.getY1()==y1)
				return myShape;
		} return null;
	}
	
	public ArrayList<MyShape> findByPosition2(int x1,int y1) {
		ArrayList<MyShape> arr = new ArrayList<>();
		for(MyShape myShape : arr) {
			if(myShape.getX1()==x1&&myShape.getY1()==y1) {
				arr.add(myShape);
			}
		} return arr;
	}
}
