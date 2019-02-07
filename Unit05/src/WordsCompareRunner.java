//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class WordsCompareRunner
{
   public static void main( String args[] )
   {
	   Scanner keyboard= new Scanner(System.in);
	   System.out.println("Enter two words:\n");
	   String a = new String(keyboard.next());
	   String b = new String(keyboard.next());
	   
	   WordsCompare test = new WordsCompare(a,b);
	   System.out.println(test);//add test cases

	}
}