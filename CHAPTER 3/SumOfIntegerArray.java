package chapter3;

public class SumOfIntegerArray {

	public static void main(String[] args) {
		
		int[] num = {1,12,14,-6,8};
		
		int sum = 0;
		
		for (int n : num) {
			sum+=n;
		}
		
		System.out.println("The sum is = "+sum);

	}

}
