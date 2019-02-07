//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven()
	{
	}

	public StringOddOrEven(String s)
	{
		setString(s);
		if (isEven()) {
			System.out.println(toString());
		}else {
			System.out.println(word + " is odd\n");
		}
	}

	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
 		int a = word.length();
 		return (a%2 ==0);
	}

 	public String toString()
 	{
 		String output= word + " is even\n";
 		return output;
	}
}