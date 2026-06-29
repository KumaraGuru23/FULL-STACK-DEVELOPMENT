package chapter3;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {
		int	product = 5 * i;
		
		if (product > 30) {
			break;
		}
		System.out.println("5 X "+i+" = "+product);
		}

	}

}
