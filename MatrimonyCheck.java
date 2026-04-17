package day4;

public class MatrimonyCheck {
   
	public static void main(String[] args) {

        char gender = 'F'; 
        int age = 18;       

        if (gender == 'F' || gender == 'f') {
            
        	if (age >= 18) {
                
        		System.out.println("She can get married");
            
        	} else {
                
        		System.out.println("Please wait, you are not yet 18");
           
        	}
       
        } else {
           
        	if (gender == 'M' || gender == 'm') {
            
            	if (age >= 21) {
                    
            		System.out.println("He can get married");
               
            	} else {
                    
            		System.out.println("Please wait, you are not yet 21");
               
            	}
            
        	} else {
                
        		System.out.println("Invalid gender entered");
            }
        }
    }
}