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
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
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
		char x= ' ';
		int b= amount;
		for(int i = a; i<a + amount; i++ )
		{
			int times = amount;
			b--;
			for(int j = a, count=0; count < amount; count++, j++)
			{
				for(int  h = times; h>0; h--)
				{
					x= (char)j;
					back += x;
				}
				back += " ";
				if(j== 'Z')
					j =64;
				times--;
			}
			back += "\n";
		}
		return back;
	}

	public String toString()
	{
		//String output= "";
		//return output;
		return Triangle();
	}
}