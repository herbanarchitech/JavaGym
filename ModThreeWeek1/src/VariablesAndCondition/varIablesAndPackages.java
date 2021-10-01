package VariablesAndCondition;
/* 
    Write an if/else statement for the following requirements:
    I.)
        If student gets 90 or higher: console log  A
        If students get 80 or above: console log B
        If students get 70 or above: console log C
        If students get 55 or above: console log D
        Any grade lower than 55 is F
    II.)
    
    	Using switch case, do the following:
        Store a number between 1-7
        If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
        Anything other than 1-7 would default to "Invalid Input"
   
    
    
   III.) 	Store a number in a variable called num and write an if statement: 
        If num is odd, display "Cool"
        If num is even and between 2-5, display "Not Cool"
        If num is even and between 6-20, display "Cool"
        If num is even and greater than 20, display "Not Cool
*/
public class varIablesAndPackages {
	public static void main(String[] args) {
		// I. We'll be writing a grading system to track students grade .
		
		int grade = 100;
		
		char A='A', B='B', C='C', D='D', F='F';		
		if(grade >= 90 && grade <=100) {
			
			System.out.println(A);
		}
		
		else if (grade >= 80 && grade <90 ) {
			System.out.println(B);
			
		}
		else if( grade >=70 && grade < 80) {
			System.out.println(C);
		}
		
		else if(grade >= 55 && grade < 70) {
			
			System.out.println(D);	
		}
		
		else {
			
			System.out.println('F');
		}
		
		
		// II.) Using Switch statement Store a number between 1-7 If the number is 1, display a message "Monday", 2 for "Tuesday", 3 for "Wednesday" etc.
		//Anything other than 1-7 would default to "Invalid Input"
		
		int laSemaine = 'M';
		
		switch (laSemaine) {
			
			case 1: System.out.println("Lundi");
			break;
			
			case 2 : System.out.println("Mardi");
			break;
				
			case 3 : System.out.println("Mercredi");
			break;
			
			case 4 : System.out.println("Jeudi");
			break;
			
			case 5 : System.out.println("Vendredi");
			break;
			
			case 6 : System.out.println("Samedi");
			break;

			case 7 : System.out.println(" Dimanche");
		break;
		
		default: System.out.println("Error:Input not valid");
		
		}
		
//		III.) Store a number in a variable called num and write an if statement:  If num is odd, display "Cool"
//	        If num is even and between 2-5, display "Not Cool"
//	        If num is even and between 6-20, display "Cool"
//	        If num is even and greater than 20, display "Not Cool
		
		int integer = 7;
		
		
		// Here putting nested if statements to great use
		if(integer >=2 && integer <= 5) {
			
			if(integer % 2 ==0) {
				
				System.out.println("cool");
		
			}else {
				System.out.println("Number is not even, sooo.....");
				}
			
		}
		else if(integer >=6 && integer <= 20) {
			
			if(integer % 2 == 0) {
				
				System.out.println("Cool");
				
			}else {
				
				System.out.println("Number is not even , soo....");
					
				}
				
			}
		
		
	}
			

}
	






