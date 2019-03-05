//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	private List<Integer> array = new ArrayList<Integer>();
	public ListDown()
	{
		array = new ArrayList<Integer>();
	}
	
	public ListDown(List<Integer> numArray)
	{
		setRay(numArray);
	}
	
	public void setRay(List<Integer> numArray)
	{
		for(int i = 0; i<numArray.size(); i++)
		{
			array.add(i, numArray.get(i));
		}
	}
	
	public /*static*/ boolean go(/*List<Integer> numArray*/)
	{
		for(int i = 0; i<array.size()-1; i++)
		{
			if(array.get(i)> array.get(i+1))
				continue;
			else return false;
		}
		return true;
	}	
	
	public String toString()
	{
		return "" + go(/*array*/);
	}
}