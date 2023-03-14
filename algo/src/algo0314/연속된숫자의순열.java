package algo0314;

public class 연속된숫자의순열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = new int[] {1,2,3};
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=3;j++) {
				for(int k=1;k<=3;k++) {
					if(i!=j&&j!=k&&i!=k)
						System.out.println(i+" "+j+" "+k);
				}
			}
		}
	}

}
