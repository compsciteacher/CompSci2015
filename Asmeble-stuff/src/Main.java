import java.text.SimpleDateFormat;

public class Main{
	public static void main(String[] args){
		String c1 = "English III", t1 = "Ms. Pesqueda";
		String c2 = "Physics", t2 = "Mr.Threat";
		String c3 = "Computer Sci 2/Advanced Programming",t3 = "Mr. Davis";
		String c4 = "US Gov/Economics",t4 = "Ms. Greenwell";
		
		System.out.printf( "My name is %s and I'll graduate in %s.", "Дилан Кеннет Элиот","2018");
		System.out.println("\n+----------------------------------------------------+");
	    System.out.printf("| 1 | %-15s %30s %s %n", c1,t1,"|");
		System.out.printf("| 2 | %-15s %30s %s %n", c2,t2,"|");
		System.out.printf("| 3 | %-15s %10s %s %n", c3,t3,"|");
		System.out.printf("| 4 | %-15s %29s %s %n", c4,t4,"|");
		System.out.println("+----------------------------------------------------+");
	}
}
