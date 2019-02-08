//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter 4 integers::");
		int a = scan1.nextInt();
		int b = scan1.nextInt();
		int c = scan1.nextInt();
		int d = scan1.nextInt();
		System.out.printf("1st integer: %d\n", a);
		System.out.printf("2nd integer: %d\n", b);
		System.out.printf("3rd integer: %d\n", c);
		System.out.printf("4th integer: %d\n", d);
		Distance dist = new Distance(a,b,c,d);	
	}
}