//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;

	public Perfect()
	{//add constructors
		setNum(0);
	}
	public Perfect(int n)
	{
		setNum(n);
	}

	public void setNum(int n) 
	{
		number = n;//add a set method
	}

	public boolean isPerfect()
	{	
		int sumdivisor=0;
		for (int i = 1; i< number; i++)
		{
			if((number%i) == 0)
			{	
				sumdivisor = i + sumdivisor;
			}
		}
		if (sumdivisor == number)
		{
			return true;
		}
		else return false;
	}

	public String toString()
	{
		if (isPerfect() == true)
		{
			return "" + number + " is perfect.\n";
		}
		else return "" + number + " is not perfect.\n";//add a toString	
	}
	
}