//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		for(int i = 1; i<=c; i++)
		{
			if(a%i==0 && b%i==0 && c%i==0)
			{
				max=i;
			}
		}

		return max;

	}

	public String toString()
	{
		String output="";
		for (int c = 1; c<number; c++)
		{
			for(int a =1; a<number; a++)
			{
				for(int b = a; b< number; b++)
				{
					if(((a%2==1 && b%2==0 && c%2==1)||(a%2==0 && b%2==1 && c%2==1))&&
						(greatestCommonFactor(a,b,c)==1)&&(Math.pow(a, 2) + Math.pow(b, 2)==Math.pow(c,2)))
							{
								output = output + a + " " + b +" " + c + "\n";
							}
				}
			}
		}
		return output+"\n";
	}
}
