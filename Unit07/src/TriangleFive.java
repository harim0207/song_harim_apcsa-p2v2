//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter(' ');
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
	}

	public void setLetter(char c)
	{
		letter =c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}
	
	public String Triangle()
	{
		String back = "";
		int a = letter;
		for(int i = a; i<=a + amount; i++)
		{
			int b = amount + letter;
			char c = (char)b;
			for(int j = amount; j>=0; j--)
			{
				int d = letter + j;
				char e= (char)d;
				for (int k = 0; k <= amount; k++)
				{
					out.println(e);
				}
				
			}
		}
	}

	public String toString()
	{
		String output="";
		return output;
	}
}