package chapter3;

public class RightAlignedTriangle {
	
	    public static void main(String[] args) {
	        int rows = 6; // You can change this value for different sizes

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces to align right
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces
	            for (int j = 1; j <= i; j++) {
	                // Print stars at the boundary (first row, last row, first column, last column)
	                if (i == rows || j == 1 || j == i) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
