
import java.util.*;public class BMICalc
{
	static public void Main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your height in meters?");
		double height = keyboard.nextLong();
		System.out.print("What is your weight in kg?");
		double weight = keyboard.nextLong() / 2.204f;
		System.out.printf("Your BMI is ", Math.pow((height/weight), 2));
		
	}
}
