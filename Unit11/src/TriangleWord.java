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
		for(int i =0; i < a.length(); i++)//times printed
		{
			for(int j = 1; j<i; j++)//letters
			{
				output += output + a.substring(0, j) + "\n"; 
			}
		}
		out.println(output);
	}
}