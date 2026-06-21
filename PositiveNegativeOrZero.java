package chapter2;

import java.util.Scanner;

public class PositiveNegativeOrZero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number = ");
		int num  = sc.nextInt();
		
		if (num > 0) {
			System.out.println("The Number Is positive");
		}else if (num < 0) {
			System.out.println("The Number Is Negative");
		}else {
			System.out.println("The Number Is Zero");
		}
		sc.close();

	}

}
