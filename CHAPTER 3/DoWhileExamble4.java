package chapter3;

public class DoWhileExamble4 {
	
    public static void main(String[] args) {
    	
	        int num = 12345;   // hardcoded number
	        int reversed = 0;

	        do {
	            int digit = num % 10;          // get last digit
	            reversed = reversed * 10 + digit; // build reversed number
	            num = num / 10;                // remove last digit
	        } while (num > 0);

	        System.out.println("Reversed number: " + reversed);
	    }
	}
