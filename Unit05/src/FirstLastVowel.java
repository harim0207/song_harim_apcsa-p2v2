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
	   int z = a.length()-1;
	   String s = "aeiouAEIOU";
	   if (s.contains(a.substring(0,1)) || s.contains(a.substring(z))) {
		   return "yes"; 
	   }
	   else {
		   return "no";
	   }
	   
	}
}