package chapter3;

public class WhileLoopExamble2 {
	
	    public static void main(String[] args) {
	        int n = 10;  // Example: first 10 natural numbers
	        int sum = 0;
	        int i = 1;

	        while (i <= n) {
	            sum += i;
	            i++;
	        }

	        System.out.println("Sum of first " + n + " natural numbers = " + sum);
	    }
	}
