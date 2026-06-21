package chapter2;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter first number = ");
		int num1 = sc.nextInt();
		
		System.out.println("enter second number = ");
		int num2 = sc.nextInt();

		int largest;
		
		if (num1 >= num2) {
			largest = num1;
		} else {
			largest = num2;
		}
		System.out.println("Largest number is "+largest);
		
		sc.close();
	}

}
