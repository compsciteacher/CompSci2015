import java.util.Scanner;
public class NameandAgeSalary{
	static public void Main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "what is your name? " );
		String name = keyboard.next();
		
		System.out.print("Hi "+name+", how old are you? ");
		double age = keyboard.nextDouble();
		
		System.out.print("So you're "+age+" eh? That's not that old!"
		+"%n How much do you make ?");
		double salary = keyboard.nextDouble();
		System.out.print(salary+", I hope that in hours and not years! LOL");
		
	}
}
