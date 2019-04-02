//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private ArrayList<Integer> list = new ArrayList<Integer>();
	private int[] sorted;
	
	public NumberShifter()
	{
	
	}
	public int[] makeLucky7Array( int size)
	{
		sorted = new int[size];
		for(int i = 0; i < size; i++)
		{
			sorted[i] = list.get(i);
		}
		return sorted;
	}
	public void shiftEm(int[] array)
	{
		Arrays.sort(array);
		int count7 =0;
		for(int i=0; i<array.length; i++)
		{
			list.add(array[i]);
			if(array[i] == 7)
			{
				count7 ++; 
			}
		}
		for(int i :array)
		{
		int index = list.indexOf(7);
		if(index != -1) list.remove(index);
		}
		
		for(int j = 0; j<count7; j++)
		{
			list.add(0, 7);
		}
	}
	
	public String toString()
	{
		return Arrays.toString(sorted);
	}
}