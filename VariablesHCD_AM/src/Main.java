import java.util.*;

public class Main
{
	
	public static void main(String[] args)
	{
		String name="Bob";	
		String date="September 18th 2015";
		int age=35;
		String loc="Chaparral Star Academy";
		
		System.out.println(name);
		System.out.println(date);
		System.out.println(age);
		System.out.println(loc);
		welcome(name,age,loc);
	}
	
	public static void welcome(String newname,int newage, String newloc){
		System.out.println("welcome method");
		newname="John";
		System.out.println(newname);
		newage=100000;
		newloc="Home";
		System.out.println(newage);
		System.out.println(newloc);
		System.out.println(newname+", you are at, "+newloc+".");
		
	}
}
