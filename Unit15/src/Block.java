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
		setColor(color.BLACK);
	}

	public Block(int x, int y)
	{
		width = height = 0;
		setPos(x,y);
		setColor(color.BLACK);
	}
	
	public Block(int x, int y, int wid, int ht)
	{
		setPos(x,y);
		setWidth(wid);
		setHeight(ht);
	}

	public Block(int x, int y, int wid, int ht, Color col)
	{
		setPos(x,y);
		setWidth(wid);
		setHeight(ht);
		setColor(col);
	}

	//add other Block constructors - x , y , width, height, color
	public void setPos(int x, int y)
	{
		xPos = x;
		yPos = y;
	}
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
	    window.setColor(color);
	    window.fillRect(getX(), getY(), getWidth(), getHeight());
	}

	public void draw(Graphics window, Color col)
	{
		window.setColor(col);
		window.fillRect(getX(), getY(), getWidth(), getHeight());
	}
   
	public boolean equals(Object obj)
	{
		Block other = (Block)obj;
		if (this.getX() == other.getX() && this.getY() == other.getY()
			&& this.getWidth() == other.getWidth() && 
			this.getHeight() == other.getHeight() && this.getColor() == other.getColor())
		return true;
		else return false;
	}

	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	public Color getColor()
	{
		return color;
	}
	public int getX()
	{
		return xPos;
	}
	public int getY()
	{
		return yPos;
	}

	

	public String toString()
	{
		String output = "";
		output = output + getX() + " "+ getY() + " "+getWidth() + " "+getHeight() + " "+getColor();
		return output;
	}
}