//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
	private int x;
	public FirstLastVowel()
	{
		x=0;
	}
	
   public static String go( String a )
	{
	   int z = a.length();
	   if (a.substring(1).equals(a.substring(z)))
			return "yes"; 
	   return "add code here";
	}
}