package day7;

public class HallowPyramid {
	
	public static void main(String[] args) {

	        int n = 4;

	        for (int i = 1; i <= n; i++) {

	            // spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // stars and spaces
	            for (int k = 1; k <= (2 * i - 1); k++) {

	                // print star at borders or last row
	                if (k == 1 || k == (2 * i - 1) || i == n) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}


