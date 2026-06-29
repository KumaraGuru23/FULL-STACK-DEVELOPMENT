package chapter3;

public class RightTringle {

	    public static void main(String[] args) {
	        int rows = 6; // You can change this value for different sizes

	        for (int i = rows; i >= 1; i--) {
	            for (int j = 1; j <= i; j++) {
	                // Print stars at the boundary (first row, last row, first column, last column)
	                if (i == rows || i == 1 || j == 1 || j == i) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  "); // Print spaces inside
	                }
	            }
	            System.out.println();
	        }
	    }
	}
