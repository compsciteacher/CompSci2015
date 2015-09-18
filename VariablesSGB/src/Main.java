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
		welcome(name);
		
	}
	
	public static void welcome(String newname, int newage, String newloc){
		newname="John";
		System.out.println(newname);
		newage=10000;
		newloc="Home";
		System.out.println(newage);
		System.out.println(newloc);
	}
}
