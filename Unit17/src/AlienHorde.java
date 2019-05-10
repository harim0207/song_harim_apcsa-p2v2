//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class AlienHorde
{
	private boolean canmove = true;
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		int first = 30;
		for(int i = 0; i< size/2; i++)
		{
			aliens.add(new Alien(first, 0));
			first += 75;
		}
		int second = 30;
		for(int i = size/2; i< aliens.size(); i++) 
		{
			aliens.add(new Alien(second, 20));
			second += 75;
		}
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll( Graphics window )
	{
		for(int i = 0; i< aliens.size(); i++)
		{
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		if(canmove)
		{
			canmove = false;
			Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				@Override 
				public void run()
				{
					canmove = true;
					timer.cancel();
				}
			}, 300);
			for(int i = 0; i< aliens.size(); i++)
			{
				aliens.get(i).move("DOWN");
				aliens.get(i).move("RIGHT"); 
				//aliens.get(i).move("LEFT");
			}
		}
	}

	public void removeDeadOnes(List<Ammo> shots)
	{
		
	}

	public String toString()
	{
		return "";
	}
}
