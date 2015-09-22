import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String name="Bob"; 
		String date="September 18th 2015";
		String loc="Chaparral Star Academy";
		int age=9090900;
		System.out.println(name);
		System.out.println(loc);
		System.out.println(age);
		hello(name,loc,age);
		
	}
	public static void hello(String newname, String newloc, int newage){
		System.out.println(newname);
		newname="John";
		newloc="Home";
		newage=87979;
		System.out.println("Hello "+newname+" you are at "+newloc+" and "+newage);
		
	}
}
