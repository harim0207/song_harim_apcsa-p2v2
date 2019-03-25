//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int count = 0;
		while( num!= 0)
		{
			int digit = num%10;
			if(digit%2 == 0) count ++;
			num= num/10;
			countOddDigits(num);
		}

		return count;
	}
}