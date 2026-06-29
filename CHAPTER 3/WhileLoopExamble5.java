package chapter3;

public class WhileLoopExamble5 {

	
	    public static void main(String[] args) {
	        int num = 12345;  // Example number

	        System.out.println("Digits of the number:");

	        while (num > 0) {
	            int digit = num % 10;   // extract last digit
	            System.out.println(digit);
	            num = num / 10;         // remove last digit
	        }
	    }
	}
