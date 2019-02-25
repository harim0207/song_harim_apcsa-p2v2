//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;
		for(int spot = 0; spot<ray.length-1; spot ++)
		{
			if (ray[spot]> ray[ray.length-1]) sum += ray[spot];
		}
		if (sum != 0)
			return sum;
		else return -1;
	}
}