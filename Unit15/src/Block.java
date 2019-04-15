//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = yPos = width = height = 0;

	}

	public Block(int x, int y)
	{
		width = height = 0;
		setX(x);
		setY(y);
	}
	
	public Block(int x, int y, int wid, int ht)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(ht);
	}

	public Block(int x, int y, int wid, int ht, Color col)
	{
		setX(x);
		setY(y);
		setWidth(wid);
		setHeight(ht);
		setColor(col);
	}

	//add other Block constructors - x , y , width, height, color
	public void setX(int x)
	{
		xPos = x;
	}
	public void setY(int y)
	{
		yPos = y;
	}
	
	public void setWidth( int wid)
	{
		width = wid;
	}
	
	public void setHeight(int ht)
	{
		height = ht;
	}
	public void setColor(Color col)
   {
		color = col;
   }

   public void draw(Graphics window)
   {
   	//uncomment after you write the set and get methods
      //window.setColor(color);
      //window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {


   }
   
	public boolean equals(Object obj)
	{

		return false;
	}   

   //add the other get methods
	public get
    

   //add a toString() method  - x , y , width, height, color
}