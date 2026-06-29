package chapter3;

import java.util.Scanner;

public class DoWhileExamble3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long fact = 1;
        int i = 1;

        // do-while loop to calculate factorial
        do {
            fact = fact * i;
            i++;
        } while (i <= num);

        System.out.println("Factorial of " + num + " = " + fact);
        sc.close();
    }
   
}
