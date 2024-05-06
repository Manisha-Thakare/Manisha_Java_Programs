package assignments;

import java.util.Scanner;

public class Assignement {

	public static void main(String[] args)
	{
		    Scanner g1 = new Scanner(System.in);
		    int number = g1.nextInt();

		    if (number % 2 == 0)
		    {
	            System.out.print("Even ");
	              if (number % 6 == 0) 
	               {
	               
	                System.out.println("and divisible by 6");
	                } 
	            
	              else 
	               {
	                System.out.println("and not divisible by 6");
	               }
	        } 
	       else 
	        {

	            System.out.println("Odd "); 
	        }
		    
	

		    
		    
		    /*if (number > 10) 
		     {
		        System.out.println("The number is Greter than 10.");
		      }
		 
		      else
		     {
		        System.out.println("The number is less than 10.");
		     }
		     */
		    
		    
		    
		    /*if (number > 0)
	        {
	            System.out.println("The number is positive.");
	        } else if (number < 0) {
	            System.out.println("The number is negative.");
	        } else 
	        {
	            System.out.println("The number is zero.");
	        }
	        */
		
		
		/*{
            int a =40;
            int b =80;
            if (a<b)
             {
	         System.out.println("A < B");
             }
            if (a>b)
            {
            	System.out.println("A > B");
            }
            if(a>=b) 
            {
            	System.out.println("A >= B");
            }
            if(a<=b) 
            {
            	System.out.println("A <= B");
            }
            if(a==b) 
            {
            	System.out.println("A == B");
            }
            if(a!=b) 
            {
            	System.out.println("A != B");
            }
}
*/

	}

}
