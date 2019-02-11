//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		int y = str.length();
		for (int x = 0; x < y-1; x ++)
		{
			if (str.substring(x, x+1).equals(str.substring(x+1, x+2)))
			{
				count = count+ 1;
			}
		}
		return count;
	}
}