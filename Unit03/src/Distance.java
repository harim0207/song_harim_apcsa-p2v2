//(c) A+ Computer Science 
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;
import java.lang.Math;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{
	}

	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1, x2, y2);
		calcDistance();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}

	public void calcDistance()
	{
		
		double d= ((double)xTwo-xOne)*((double)xTwo-xOne)+((double)yTwo-yOne)*((double)yTwo-yOne);
		distance = Math.sqrt(d);
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public void print()
	{
		System.out.printf("Dist: %.3f\n", distance);
	}
	
	//complete print or the toString

	public String toString()
	{
		return "" + distance;
	}
}