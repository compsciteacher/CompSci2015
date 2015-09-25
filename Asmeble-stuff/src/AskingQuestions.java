import java.util.Scanner;

public class AskingQuestions
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		int age;
		String feet,inches;
		double weight;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		System.out.print( "How tall are you(feet)? " );
		feet = keyboard.next();

		System.out.print( "How tall are you(inches)? " );
		inches = keyboard.next();
		
		System.out.print( "How much do you weigh? " );
		weight = keyboard.nextDouble();

		System.out.println( "So you're " + age + " old, " + feet+"'" +inches + 
		'"' + " tall and weigh" + weight + " pounds." );
	}
}
