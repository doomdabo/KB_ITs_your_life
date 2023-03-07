import java.util.Scanner;

public class J1291_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s, e;
		Scanner sc = new Scanner(System.in);
		s = sc.nextInt();
		e = sc.nextInt();
		while (true) {
			if (s > 9 || e > 9 || s < 2 || e < 2) {
				System.out.println("INPUT ERROR!");
				s = sc.nextInt();
				e = sc.nextInt();
			} else
				break;
		}

		if (s <= e) {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i <= e; i++)  {
					System.out.printf("%d * %d = %3d",i,j,i*j);
					
				}
				System.out.println();
			}
		}else {
			for (int j = 1; j <= 9; j++) {
				for (int i = s; i >= e; i--)  {
					System.out.printf("%4d * %d = %3d \n" ,i,j,i*j);
					
				}
				System.out.println();
			}
		}


	}

}
