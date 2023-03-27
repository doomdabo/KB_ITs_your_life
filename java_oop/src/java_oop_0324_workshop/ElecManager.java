package java_oop_0324_workshop;

import java.util.ArrayList;

import java_oop_0324.vo.MyShape;


public class ElecManager {
	private ArrayList<Elec> arr = new ArrayList<>();

	public void add(TV tv1) {
		// TODO Auto-generated method stub
		arr.add(tv1);
	}
	public void add(AirConditioner ac1) {
		// TODO Auto-generated method stub
		arr.add(ac1);
	}
	public int getCount() {
		return arr.size();
	}
	public void printAll() {
		System.out.println("**전체 출력**");
		for(Elec elec : arr) {
			System.out.println(elec.toString());
		}
	}
}
