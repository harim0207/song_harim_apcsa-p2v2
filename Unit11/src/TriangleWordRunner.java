//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard= new Scanner(System.in);
		TriangleWord test = new TriangleWord();
		String choice = "y";
		
		do {
		out.println("Enter a word: ");
		String word = keyboard.next();
		test.setWord(word);
		test.printTriangle();
		
		out.println("Do you want to enter more sample input?");
		choice = keyboard.next();
		}while(choice.equals("y")||choice.contentEquals("Y"));
	}
}