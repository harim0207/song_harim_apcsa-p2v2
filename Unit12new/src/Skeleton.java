//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int size;
	private String name;
	public Skeleton()
	{
		name = "";
		size = 0;
	}
	
	public Skeleton(String n, int s)
	{
		name = n;
		size = s;
	}
	
	public int getHowBig() 
	{
		return size;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean isBigger(Monster other)
	{
		return size > other.getHowBig();
	}
	
	public boolean isSmaller(Monster other)
	{
		return size < other.getHowBig();
	}
	
	public boolean namesTheSame(Monster other)
	{
		return name.equals(other.getName());
	}
	
	public String toString()
	{
		return name + "" + size;
	}
}