//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class Line
{
	public static double getSlope( int x1, int y1, int x2, int y2 )
	{
		double m;
		m= (double) (y2-y1)/(x2-x1);
		return m;
	}

}