package chapter2;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number = ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number = ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Third Number = ");
		int num3 = sc.nextInt();
		
		int largest;
		if (num1 >= num2 && num1 >= num3) {
		largest = num1;
		} else if (num2 >= num1 && num2 >= num3) {
		largest = num2;
		} else {
			largest = num3;
				
		}
		System.out.println("Largest Number Is = "+largest);
		
		sc.close();

	}

}
