//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(int[] numArray)
	{
		int count =0;
		for(int spot = 0; spot<numArray.length-1; spot++)
		{
			if(numArray[spot] > numArray[spot+1])
			{
				count ++;
			}
		}
		return count == numArray.length-1;
	}	
}