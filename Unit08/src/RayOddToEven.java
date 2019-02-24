//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int odd=0,even=0;
		for(int spot = 0; spot<ray.length; spot++)
		{
			if(ray[spot]%2 ==1)
			{
				odd = spot;
				break; 
			}
			else odd=-1;
		}
		if (odd >=0)
			{
			for(int spot = odd; spot < ray.length; spot++)
				{
					if(ray[spot]%2==0)
					{
						even = spot;
						break;
					}
				}
			}
		if(odd==-1)
		{
			return odd;
		}
		else return (even-odd);
	}
}