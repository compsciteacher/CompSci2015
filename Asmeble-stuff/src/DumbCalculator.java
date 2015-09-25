import java.util.Scanner;
public class DumbCalculator{
	static public void Main(String[] args){
		double n1,n2,n3;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your first number?");
		n1 = keyboard.nextDouble();
		System.out.print("What is your second number?");
		n2 = keyboard.nextDouble();
		System.out.print("What is your second number?");
		n3 = keyboard.nextDouble();
		System.out.printf("(%s + %s + %s)/2) is ", n1, n2, n3,
		(( 1.1 + 2.2 + 5.5 ) / 2));
	}
}
