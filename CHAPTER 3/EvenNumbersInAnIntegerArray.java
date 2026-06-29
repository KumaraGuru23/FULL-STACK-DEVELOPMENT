package chapter3;

public class EvenNumbersInAnIntegerArray {

	public static void main(String[] args) {
		int[] arr = {55,54,52,50,62,66,87,79,77};
		
		int count = 0;
		
		for (int num : arr) {
			if (num % 2 == 0) {
				count++;
			}
		}
		System.out.print("number of even elementsw = "+count);
	}

}
