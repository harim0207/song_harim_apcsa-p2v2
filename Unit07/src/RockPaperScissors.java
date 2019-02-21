//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		Random ran= new Random();
		int a = ran.nextInt(3);
		if (a == 0)
		{
			compChoice= "R";
		}
		else if (a==1)
		{
			compChoice = "P";
		}
		else compChoice = "S";	
		playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
		if ((compChoice.equals("R")&&playChoice.equals("S"))||(compChoice.equals("S")&&playChoice.equals("P"))
				||(compChoice.equals("P")&&playChoice.equals("R")))
		{
			winner = "Computer wins!";
		}
		else if ((playChoice.equals("R")&&compChoice.equals("S"))||(playChoice.equals("S")&&compChoice.equals("P"))
				||(playChoice.equals("P")&&compChoice.equals("R")))
		{
			winner = "Player wins!";
		}
		else if (compChoice.equals(playChoice))
		{
			winner = "Draw Game!";
		}
		return winner;
	}

	public String toString()
	{
		return  "player had " + playChoice + "\ncomputer had " + compChoice + "\n" + determineWinner() + "\nDo you want to play again?" ;
	}
}