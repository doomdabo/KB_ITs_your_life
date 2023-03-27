package java_oop_0324.vo;

public class MyCircle extends MyShape{
	int radius;
	public MyCircle(int x1, int y1, int radius) {
		super(x1,y1);
	}

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", radius="+radius;
	}
	
	public String draw() {
		return "Circle: " + toString();
	}
}
