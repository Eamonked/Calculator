package calcl;

import java.util.Scanner;

public class calculator {

	

	public static void main(String[] args) {
		Scanner valueInput = new Scanner(System.in);
		
		//While loop to keep the application running.
		while(true) {;
		
			
		
			//Request for the user in put.
			System.out.println("Enter value1, value2 ::");
			
			//Scanner valueInput = new Scanner(System.in);

			//Variables to store Values for the calculations.
			Double val1 = valueInput.nextDouble();
			Double val2 = valueInput.nextDouble();
		
			
			//Selecting the Desired Operation
			System.out.println("For addition:: Press 1"); 
			System.out.println("For subtraction:: Press 2");
			System.out.println("For division:: Press 3");
			System.out.println("For multiplication:: Press 4");
			System.out.println("For Remainder:: Press 5");
			System.out.println("For Exit:: Press 6");

			// Variable to Store the OPeration
			int val3 = valueInput.nextInt();
			
			//Condition Statements to determine which operation to be executed.	  
			
			
		  	if (val3 == 1) {
		  		//Addition Condition
		  		System.out.println("Addition of " + val1 + " + " + val2 + " = " + (val1 +val2));
		  	
		  	}else if (val3 == 2) {
		  		//Subtraction Condition
		  		System.out.println("Subtraction of " + val1 + " - " + val2 + " = " + (val1 - val2));
			
		  
		  	}else if (val3 == 3) {
		  		//Division Condition.
		  		System.out.println("Division of " + val1 + " / " + val2 + " = " + (val1 / val2));
			
		  	}else if (val3 == 4) {
		  		//MUltiplication Condition.
		  		System.out.println("Multiplication of " + val1 + " * " + val2 + " = " + (val1 * val2));
			
		  
		    }else if (val3 == 5) {
		    	//MOdulo COndiotion.
		      	System.out.println("MOdulo/ Remainder of " + val1 + " / " + val2 + " = " + (val1 % val2));
		      	
		    }else if (val3 == 6) {
		    	//Exit the app.
		    	break;

		  	}else {
		    		System.out.println("Do You want to Try again");
		  		}
		  	
		  	
		  	 
		}
		
	  	
	  	


	}


}

