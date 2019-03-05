//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DownRunner
{
	public static void main( String args[] )
	{	
		List<Integer> numArray = Arrays.asList(-99,1,2,3,4,5,6,7,8,9,10,12345);
		ListDown test =ListDown(numArray);
		System.out.println(test.go());
		
	}

}