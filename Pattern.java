package day7;

public class Pattern {

	public static void main(String[] args) {
		
		        int n = 4;

		        for (int i = 1; i <= n; i++) {

		            // spaces
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print("  ");   // double space for alignment
		            }

		            // stars (odd numbers: 1,3,5,7)
		            for (int k = 1; k <= (2 * i - 1); k++) {
		                System.out.print("* ");
		            }

		            System.out.println();
		        }
		    }
		

	}


