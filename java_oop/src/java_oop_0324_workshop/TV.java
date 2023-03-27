package java_oop_0324_workshop;

public class TV extends Elec {
	private int inch;
	private String panel;

	public TV(int price, int birth, int inch, String panel) {
		super(price, birth);
		// TODO Auto-generated constructor stub
		this.inch = inch;
		this.panel = panel;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public String getPanel() {
		return panel;
	}

	public void setPanel(String panel) {
		this.panel = panel;
	}

	@Override
	public String toString() {
		return super.toString() + ", inch:" + inch + ", panel:" + panel;
	}

}
