//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRowConstructor
{
	private int[][] matrix;
	public TotalRowConstructor()
	{
		setMat(new int[1][1]);
	}
	
	public TotalRowConstructor(int [][] m)
	{
		setMat(m);
	}
	public void setMat(int [][] m)
	{
		matrix = m;
	}
    public static List<Integer> getRowTotals( int [][] m )
    {
    	List<Integer> ListSum = new ArrayList<Integer>();
    	int sum =0;
    	for(int i = 0; i< m.length; i++)
    	{
    		sum = 0;
    		for(int j = 0; j< m[i].length; j++)
    		{
    			sum += m[i][j];
    		}
   			ListSum.add(sum);
    	}
		return ListSum;
    }
}
