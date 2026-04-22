package day7;

public class HollowDiamond {
	
	 public static void main(String[] args) {

	        int n = 3; // controls size (gives total 5 rows)

	        // Upper part
	        for (int i = 1; i <= n; i++) {

	            // spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // stars and hollow spaces
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                if (k == 1 || k == (2 * i - 1)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }

	            System.out.println();
	        }

	        // Lower part
	        for (int i = n - 1; i >= 1; i--) {

	            // spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  ");
	            }

	            // stars and hollow spaces
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                if (k == 1 || k == (2 * i - 1)) {
	                    System.out.print("* ");
	                } else {
	                    System.out.print("  ");
	                }
	            }

	            System.out.println();
	        }
	    }
	}

