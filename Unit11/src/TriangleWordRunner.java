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
		
		out.println("Enter a word: ");
		String word = keyboard.next();
		test.setWord(word);
		test.printTriangle();
	}
}