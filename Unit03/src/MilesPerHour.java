//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;

	public MilesPerHour()
	{
		setNums(0,0,0);
		mph=0.0;
		calcMPH();
		print();
	}

	public MilesPerHour(int dist, int hrs, int mins)
	{
		setNums(dist, hrs, mins);
		calcMPH();
		print();
	}

	public void setNums(int dist, int hrs, int mins)
	{
		distance = dist;
		hours = hrs;
		minutes = mins;
	}

	public void calcMPH()
	{
		double thours;
		thours= ((double)minutes/60) + hours;
		mph = (double)distance/thours;
	}

	public void print()
	{
		System.out.printf("%d miles in %f hours\n", distance,(double)minutes/60 + hours);
		System.out.printf("MPH: %.4f", mph);
	}
	
	//create a print or toString or both
	
	public String toString()
	{
		return "";
	}
}