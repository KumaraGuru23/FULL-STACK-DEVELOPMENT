package chapter3;

public class WhileLoopExamble9 {

	    public static void main(String[] args) {
	        int num = 12345;   // Example number
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;   // extract last digit
	            sum += digit;           // add digit to sum
	            num = num / 10;         // remove last digit
	        }

	        System.out.println("Sum of digits = " + sum);
	    }
	}
