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
		ListDown test = new ListDown(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(10,9,8,7,6,5,4,3,2,1,-99);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(10,20,30,40,50,-11818,40,30,20,10);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(32767);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(255,255);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(9,10,-88,100,-555,1000);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(10,10,10,11,456);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(-111,1,2,3,9,11,20,30);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(9,8,7,6,5,4,3,2,0,-2,-989);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(12,15,18,21,23,1000);
		test.setRay(numArray);
		System.out.println(test.go());
		numArray = Arrays.asList(250,19,17,15,13,11,10,9,6,3,2,1,-455);
		test.setRay(numArray);
		System.out.println(test.go());		
		numArray = Arrays.asList(9,10,-8,10000,-5000,1000);
		test.setRay(numArray);
		System.out.println(test.go());
	}

}