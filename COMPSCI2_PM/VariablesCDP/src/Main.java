import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String name="bob";
		String date="September 18th 2015";
		String loc="Chaparral Star Academy";
		int age=9090900;
		System.out.println(name);
		System.out.println(loc);
		System.out.println(age);
		hello(name,loc,age);
		
		
	}
	public static void hello(String newName, String newLoc, int newAge){
		//System.out.println("hello method);
		newName = "John";
		newLoc = "Home";
		newAge = 87979;
		System.out.println("Hello "+newName+" you are at "+newLoc+" and "+newAge);
		
	}
}
