package chapter3;

public class WhileLoopExamble4 {
	
	    public static void main(String[] args) {
	        int num = 5;   // Example number
	        long fact = 1;
	        int i = 1;

	        while (i <= num) {
	            fact = fact * i;
	            i++;
	        }

	        System.out.println("Factorial of " + num + " = " + fact);
	    }
	}
