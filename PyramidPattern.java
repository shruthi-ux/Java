package day6;

public class PyramidPattern {
	
	
	    public static void main(String[] args) {
	        int n = 3; // number of rows

	        for (int i = 1; i <= n; i++) {

	            //Spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	}


