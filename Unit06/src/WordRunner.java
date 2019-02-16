//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		Word test = new Word("Hello");
		out.println(test);
		test.setString("World");
		out.println(test);
		test.setString("Jukebox");
		out.println(test);
		test.setString("TCEA");
		out.println(test);
		test.setString("UIL");
		out.println(test);//add test cases		
	}
}