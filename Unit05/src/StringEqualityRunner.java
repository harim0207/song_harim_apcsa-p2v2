//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter two words: ");
		String a = new String(keyboard.next());
		String b = new String(keyboard.next());
		
		StringEquality test = new StringEquality( a, b);
		System.out.println(test);
		//add test cases
		
	}
}