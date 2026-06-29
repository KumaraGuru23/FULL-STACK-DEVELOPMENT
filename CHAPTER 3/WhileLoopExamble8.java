package chapter3;

public class WhileLoopExamble8 {

	    public static void main(String[] args) {
	        int n = 10;  // Example: first 10 terms
	        int first = 0, second = 1;

	        System.out.println("Fibonacci Series:");

	        int i = 1;
	        while (i <= n) {
	            System.out.print(first + " ");
	            int next = first + second;
	            first = second;
	            second = next;
	            i++;
	        }
	    }
	}

