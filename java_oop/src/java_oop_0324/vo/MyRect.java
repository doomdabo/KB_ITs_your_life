package java_oop_0324.vo;

public class MyRect extends MyShape {
	int width, height;

	public MyRect(int x1,int y1, int width, int height) {
		super(x1,y1);
		this.height = height;
		this.width = width;
	}

	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return super.toString()+", width=" + width + ", height=" + height;
	}
	public String draw() {
		return "Rect: " + toString();
	}
	
}
