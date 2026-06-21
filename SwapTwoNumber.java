package chapter2;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter First Number =");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number =");
		int num2 = sc.nextInt();
		
		System.out.println("Before Swap First number = "+num1+" Second Number = "+num2);
		
		int temp = num1;
		num1 = num2;
	    num2 = temp;
	    
	    System.out.println("After Swap First number = "+num1+" Second Number = "+num2);
	    
	    sc.close();
		
	}

}
