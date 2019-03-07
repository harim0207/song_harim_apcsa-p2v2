//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	private List<Integer> sum= new ArrayList<Integer>();
	public ListSumFirst()
	{
		setRay(new ArrayList<Integer>());
	}
	public ListSumFirst(List<Integer> ray)
	{
		setRay(ray);
	}
	public void setRay(List<Integer> ray)
	{
		sum.clear();
		for(int i =0;i< ray.size(); i++)
		{
			sum.add(ray.get(i));
		}
	}
	public /*static*/ int go(/*List<Integer> ray*/)
	{
		int total=0;
		for(int i = 1; i<sum.size(); i++)
		{
			if(sum.get(0) < sum.get(i))
				total += sum.get(i);
		}
		if(total == 0)
			return -1;
		else return total;
	}
	public String toString()
	{
		return "" + go();
	}
}