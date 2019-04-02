//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		NumberShifter test = new NumberShifter();
		test.shiftEm(new int[]{7,1,5,3,11,5,6,7,8,9,10,12345,11});
		out.println(test.makeLucky7Array(13));

	}
}



