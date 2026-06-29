package chapter3;

public class NumberSquare {

	    public static void main(String[] args) {
	        int n = 5; // Size of the square

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= n; j++) {
	                // Print numbers at the boundary (first row, last row, first column, last column)
	                if (i == 1 || i == n || j == 1 || j == n) {
	                    System.out.print(j + " ");
	                } else {
	                    System.out.print("  "); // Print spaces inside
	                }
	            }
	            System.out.println();
	        }
	    }
	}
