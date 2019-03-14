//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;
import java.util.Scanner;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Toy test = new Toy();
		String choice = "y";
		
		do {
			out.println("Enter a toy: ");
			String toy = keyboard.next();
			test.setName(toy);
			
			out.println("Enter the count: ");
			int count = keyboard.nextInt();
			test.setCount(count);
			
			out.println(test);
			out.print("Do you want to add more toys? ");
			choice = keyboard.next();
		}while ( choice.equals("Y")||choice.contentEquals("y"));
		
		
	}
}