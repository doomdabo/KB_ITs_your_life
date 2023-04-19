package web0419.servlet;

public class SimpleDto {
	private String mid;
	private String[] singer;
	
	public SimpleDto() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SimpleDto(String mid, String[] singer) {
		super();
		this.mid = mid;
		this.singer = singer;
	}


	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}

	public String[] getSinger() {
		return singer;
	}
	public void setSinger(String[] singer) {
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "SimpleDto [mid=" + mid + ", singer=" + singer + "]";
	}
	
	

}
