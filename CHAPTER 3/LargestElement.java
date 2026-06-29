package chapter3;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = {50,45,80,65,70};
		
		int largest = arr[0];
		
		for (int i = 1; i < arr.length; i ++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.print("largest elemen = "+largest);

	}

}
