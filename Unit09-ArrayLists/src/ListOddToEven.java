//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	private List<Integer> dist = new ArrayList<Integer>();
	public ListOddToEven()
	{
		setRay(new ArrayList<Integer>());
	}
	public ListOddToEven(List<Integer> ray)
	{
		setRay(ray);
	}
	public void setRay(List<Integer> ray)
	{
		dist.clear();
		for(int i = 0; i<ray.size(); i++)
		{
			dist.add(ray.get(i));
		}
	}

	public /*static*/ int go(/* List<Integer> ray */)
	{		
		for(int odd = 0; odd< dist.size(); odd++)
		{
			if(dist.get(odd)%2 == 1) 
				for(int even= dist.size()-1; even> odd ; even--)
				{
					if(dist.get(even)%2 ==0)
						return even-odd;
				}
		}
		return -1;
	}
	public String toString()
	{
		return "" + go();
	}
}