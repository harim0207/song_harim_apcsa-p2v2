//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
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
