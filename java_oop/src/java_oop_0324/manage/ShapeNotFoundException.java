package java_oop_0324.manage;

public class ShapeNotFoundException extends Exception {

	private int x1;
	private int y1;

	public ShapeNotFoundException(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	} //오류 메시지 표시
}

/*
 * 사용자 정의 예외를 반드시 처리하도록 하려면 Exception 상속
 * 사용자 정의 예외를 처리하지 않아도 되도록 하려면 RunTimeException 상속
 * */
 