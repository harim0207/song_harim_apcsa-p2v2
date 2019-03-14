//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
		loadToys("");
	}
	
	public ToyStore(String toys)
	{
		toyList = new ArrayList<Toy>();
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		String[] ToyArr = toys.split(" ");
		String toyName = "";
		boolean exists = false;
		for(int i = 0; i < ToyArr.length; i++)
		{
			exists = false;
			for (int j = 0; j < toyList.size(); j++)
			{
				if (ToyArr[i].equals(toyList.get(j).getName()))
				{
					exists = true;
					toyList.get(j).setCount(toyList.get(j).getCount() + 1);
					break;
				}
			}
			
			if (exists == false )
			{
				toyName = ToyArr[i];
				toyList.add(new Toy(toyName));
				
			}
		}
	}
  
  	public Toy getThatToy( String nm )
  	{

  		return ;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}