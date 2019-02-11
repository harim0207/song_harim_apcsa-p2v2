/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String s1 = new String(statement.trim());
		if (s1.length() < 1) {
			return "Say something, please.";
		}
		String response = "";
		if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.contains("dog") || statement.contains("cat") || statement.contains("hamster")) {
			return "Tell me more about your pets.";
		}
		else if (statement.contains("Mauro")) {
			return "I have heard many good things about that teacher. Is he still teaching at CCA?";
		}
		else if (statement.contains("sad")) {
			return "I am sorry you feel that way. Do you want to talk about it more?";
		}
		else if (statement.contains("ate") || statement.contains("eat")) {
			return "What is your most favorite food?";
		}
		else if (statement.contains("stress")) {
			return "I know you feel stressed, but I know you'll get past it. What's a time you were stressed, but everything turned out fine?";
		}
		else if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Tell me the details.";
		}
		else if (whichResponse == 5)
		{
			response = "Thanks for telling me.";
		}

		return response;
	}
}
