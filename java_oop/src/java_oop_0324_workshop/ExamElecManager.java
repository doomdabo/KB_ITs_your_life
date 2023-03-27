package java_oop_0324_workshop;

public class ExamElecManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElecManager em = new ElecManager();
		TV tv1 = new TV(200,2022,50,"LED");
		em.add(tv1);
		TV tv2 = new TV(300,2023,60,"HD");
		em.add(tv2);
		
		AirConditioner ac1 = new AirConditioner(200, 2020, 200, 50);
		em.add(ac1);
		AirConditioner ac2 = new AirConditioner(100, 2010, 250, 30);
		em.add(ac2);
		
		int count = em.getCount();
		System.out.println(count);
		
		em.printAll();

		
	}

}
