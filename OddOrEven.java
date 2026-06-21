package chapter2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter The Number = ");
		int num  = sc.nextInt();
		
		if( num % 2 == 0) {
		System.out.println("Its Even Number....");
		} else {
			System.out.println("Its Odd Number....");
		}
		sc.close();

	}

}
