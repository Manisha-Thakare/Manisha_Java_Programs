package basicknowledge;
import java.util.*;
public class ScannerClass2 {

	public static void main(String[] args)
	{
		//Scanner s1 = new Scanner (System.in);
		/*String s2= s1.nextLine();
		String s3= s1.nextLine();
		System.out.println("test");
		System.out.println("mani");
		//String s3= s1.nextLine();
*/
    Scanner scanner = new Scanner(System.in);
        
        // Using next()
        System.out.println("Enter your first name:");
        String firstName = scanner.next();
        System.out.println("First Name: " + firstName);
        
        // Consuming the leftover newline
        scanner.nextLine();
        
        // Using nextLine()
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        System.out.println("Full Name: " + fullName);
        
	}

}
