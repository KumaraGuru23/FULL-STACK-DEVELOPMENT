package chapter3;

public class InergerArray {

	public static void main(String[] args) {
		
		int[] number = {10,20,30,40,50};
		
		for (int num : number ) {
			System.out.println(num+"");
			
		}
		System.out.println();
		
		System.out.println(java.util.Arrays.toString(number));
	}

}
