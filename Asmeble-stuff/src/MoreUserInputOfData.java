import java.util.Scanner;
public class MoreUserInputOfData{
	static public void Main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the following information so I can sell it for a profit!" +
		" Hey, free smileys are free smileys! :)");

		System.out.print("First name: ");
		String fn = keyboard.next();
		
		System.out.print("Last name: ");
		String ln = keyboard.next();
		
		System.out.print("Grade (9-12): ");
		String grade = keyboard.next();
		
		System.out.print("Student ID: ");
		String SID= keyboard.next();
		
		System.out.print("Login: ");
		String SL= keyboard.next();
		
		System.out.print("GPA: ");
		String GPA= keyboard.next();
		
		System.out.printf("Your information:%n Login: %s%n ID: %s%n Name: %s, %s%n GPA: %s%n Grade: %s",
		SL, SID, ln, fn, GPA, grade);
	}
}
