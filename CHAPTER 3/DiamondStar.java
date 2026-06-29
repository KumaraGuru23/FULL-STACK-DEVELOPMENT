package chapter3;

public class DiamondStar {

	    public static void main(String[] args) {
	        int rows = 6; // You can change this value for different sizes

	        // Upper half of diamond
	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = i; j < rows; j++) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (j == 1 || j == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }

	        // Lower half of diamond
	        for (int i = rows - 1; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = rows; j > i; j--) {
	                System.out.print(" ");
	            }

	            // Print stars and spaces
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                if (j == 1 || j == (2 * i - 1)) {
	                    System.out.print("*");
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}


