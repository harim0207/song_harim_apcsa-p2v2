//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WordPrinter
{
	//instance variables and constructors could be present, but are not necessary
	private String a; private int num;
		
	public WordPrinter()
	{
		setVal("", 0);
	}
	public WordPrinter(String word, int times)
	{
		setVal(word, times);
	}
	
	public void setVal(String word, int times)
	{
		a = word;
		num = times;
	}
	public void printWord(/*String word, int times*/)
	{
		String output = "";
		for(int i =0; i<num; i++)
		{
			output += a + "\n";
		}
		out.println(output);	
	}
	
}