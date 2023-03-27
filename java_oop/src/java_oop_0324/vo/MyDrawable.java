package java_oop_0324.vo;

public interface MyDrawable {
	//인터페이스 내 모든 변수는 public static final
	String NAME = "MyDrawable";
	//인터페이스 내 모든 메서드는 자동으로 abstract public
	public String draw();
}
