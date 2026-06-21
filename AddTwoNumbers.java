package chapter2;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Number = ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number=");
		int num2 = sc.nextInt();
		
		int sum = num1+num2;
				
		System.out.println("Total Number = "+sum);
		
		sc.close();
	}
	
}
