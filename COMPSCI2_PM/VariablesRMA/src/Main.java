import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		String name="Reggie";
		String loc="Chaparral Star Academy";
		int age=9090900;
		System.out.println(name);
		System.out.println(loc);
		System.out.println(age);
		System.out.println("");
		hello(name,loc,age);
	}
	public static void hello(String newname, String newloc, int newage)
	{
		newname="John";
		newloc="Nowhere";
		newage=7;
		System.out.print("Howdy, "+newname+newloc+newage+"!");
	}
}
