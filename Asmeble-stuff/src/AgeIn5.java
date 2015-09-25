import java.util.Scanner;
public class AgeIn5{
	static public void Main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Hello.  What is your name? ");
		String name = keyboard.next();
		System.out.print("Hi, "+name+"! How old are you?");
		double age = keyboard.nextDouble();
		System.out.println("Did you know that in five years you will be"+ (age+5) +"years old?%n"+
		"And five years ago you were" +(age-5)+"! Imagine that!");
	}
}
