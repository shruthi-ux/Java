package day5;

public class LoginValidation {

	 public static void main(String[] args) {

	        String userId = "admin";     
	        String password = "1234";    

	        if (userId.equals("admin")) {
	            
	            if (password.equals("1234")) {
	                
	            	System.out.println("Login Successful");
	           
	            } else {
	                
	            	System.out.println("Login Unsuccessful");
	            }

	        } else {
	            
	        	System.out.println("Invalid USERID, Try Again");
	        }
	    }
	}

