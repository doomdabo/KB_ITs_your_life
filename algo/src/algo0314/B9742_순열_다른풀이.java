package algo0314;

import java.util.Arrays;

public class B9742_순열_다른풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=2;i++) {
			int[] arr = new int[] {1,2,3};
			int temp = arr[0];
			arr[0] = arr[0+i];
			arr[0+i] = temp;
			System.out.println(Arrays.toString(arr));
			temp = arr[1];
			arr[1] = arr[2];
			arr[2] = temp;
			System.out.println(Arrays.toString(arr));
		}
	}

}
