//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
   public static String go( String a )
	{
	   if (((a.substring(3,4)).equals("-")) && (a.substring(6,7).equals("-"))){
		   return a.substring(a.length()-4);
	   }
	   else return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/