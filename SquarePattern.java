package day6;

public class SquarePattern {
	public static void main(String[] args) {

	        int n = 5;

	        // Top row
	        for (int j = 1; j <= n; j++) {
	            System.out.print("* ");
	        }
	        System.out.println();

	        // Middle rows
	        for (int i = 2; i <= n - 1; i++) {

	            // Left star
	            for (int j = 1; j <= 1; j++) {
	                System.out.print("* ");
	            }

	            // Spaces
	            for (int j = 2; j <= n - 1; j++) {
	                System.out.print("  ");
	            }

	            // Right star
	            for (int j = 1; j <= 1; j++) {
	                System.out.print("* ");
	            }

	            System.out.println();
	        }

	        // Bottom row
	        for (int j = 1; j <= n; j++) {
	            System.out.print("* ");
	        }
	    }
	}


