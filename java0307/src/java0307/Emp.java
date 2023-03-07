package java0307;

public class Emp extends Person {

	private String buseo;

	public Emp(String name, int age, String buseo) {
		super(name, age);
		this.buseo = buseo;
	}

	public String getBuseo() {
		return buseo;
	}

	public void setBuseo(String buseo) {
		this.buseo = buseo;
	}

	@Override
	public String toString() {
		return super.toString() + ", 부서=" + buseo;
	}

}
