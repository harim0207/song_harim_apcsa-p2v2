//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;

	public Doggies(int size)
	{
		//point pups at a new array of Dog
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		//put a new Dog in the array at spot 
		//make sure spot is in bounds		
		Dog Dog1 = new Dog(age, name);
		if(spot < pups.length)
			{
				for(int i = 0; i<pups.length; i++)
				{
					pups[spot] = Dog1;
				}
			}
	}

	public String getNameOfOldest()
	{
		int old = 0;
		int j=0;
		for(int i =0; i<pups.length; i++)
		{
			if(pups[i].getAge() > old)
			{
				old = pups[i].getAge();
				j=i;
			}
		}
		return pups[j].getName();
	}

	public String getNameOfYoungest()
	{
		int young = 10000000;
		int j=0;
		for(int i =0; i<pups.length; i++)
		{
			if(pups[i].getAge() < young)
			{
				young = pups[i].getAge();
				j=i;
			}
		}
		return pups[j].getName();
	}

	public String toString()
	{
		return ""+Arrays.toString(pups);
	}
}