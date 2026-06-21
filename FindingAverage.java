package chapter2;

import java.util.Scanner;

public class FindingAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the 1st number = ");
		int num1 = sc.nextInt();
		
		System.out.println("enter the 2rd number = ");
		int num2 = sc.nextInt();
		
		System.out.println("enter the 3rd number = ");
		int num3 = sc.nextInt();
		
		System.out.println("enter the 4th number = ");
		int num4 = sc.nextInt();
		
		System.out.println("enter the 5th number = ");
		int num5 = sc.nextInt();
		
		int average = (num1+num2+num3+num4+num5)/5;
		
		System.out.println("The Average Of A Values = "+average+"%");
		
		sc.close();
		

	}

}
