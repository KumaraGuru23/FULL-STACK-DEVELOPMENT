package chapter2;

import java.util.Scanner;

public class NameAndMark {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name = ");
		String name = sc.nextLine();
		
		System.out.println("Enter Student Mark = ");
		int num = sc.nextInt();
		
		System.out.println("Student Name = "+name);
		System.out.println("Student Mark = "+num);
		
		sc.close();
	}

}
