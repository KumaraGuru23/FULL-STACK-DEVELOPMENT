package chapter3;

public class InvertedPyramid {

	    public static void main(String[] args) {
	        int rows = 6; // You can change this value for different sizes

	        for (int i = rows; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                // Print stars at the boundary (first row, last row, first column, last column)
	                if (i == rows || j == 1 || j == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
