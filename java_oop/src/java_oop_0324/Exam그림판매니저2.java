package java_oop_0324;

import java_oop_0324.vo.MyDrawable;
import java_oop_0324.vo.MyLine;

public class Exam그림판매니저2 {

	public static void main(String[] args) {
		MyLine ml1 = new MyLine(3,4,5,6);
		MyDrawable md = (MyDrawable)ml1;
		System.out.println(md.draw());
		md = new MyCarPicture();
		System.out.println(md.draw());
		MyDrawable[] mdarr = new MyDrawable[2];
		mdarr[0] = ml1;
		mdarr[1] = md;
		for(MyDrawable mdr :mdarr)
			System.out.println(mdr.draw());
				
	}

}
