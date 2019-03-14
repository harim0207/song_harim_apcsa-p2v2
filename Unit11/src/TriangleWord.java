//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
	private String a;
	
	public TriangleWord()
	{
		setWord("");
	}
	public TriangleWord(String word)
	{
		setWord(word);
	}
	
	public void setWord(String word)
	{
		a = word;
	}
	public void printTriangle(/*String word*/)
	{
		String output = "";
		String in = "";
		for(int j = 1; j<=a.length(); j++)//letters
		{
			in = a.substring(0,j);
			for(int k = 0; k<j; k++)//# of times printed
			{
				output += in;
			}
			output +="\n";
		}
		out.println(output);
	}
}