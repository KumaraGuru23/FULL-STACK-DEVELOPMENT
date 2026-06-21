package chapter2;

import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter The Value Of Principal : ");
		double principal = sc.nextDouble();
		
		System.out.print("Enter The Value Of Rate (in %) : ");
		double rate = sc.nextDouble();
		
		System.out.print("Enter The Value Of time : ");
		double time = sc.nextDouble();
		
		double interest = ( principal * rate * time ) / 100;
		
		System.out.println("Interest Of A Value is = "+interest);
		
		sc.close();
	}
	

}
