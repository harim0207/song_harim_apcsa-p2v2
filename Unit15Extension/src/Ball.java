import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 1;
		ySpeed = 1;
	}
	//add the other Ball constructors
	public Ball(int x, int y) {
		super(x,y);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width) {
		super(x,y,width);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height) {
		super(x,y,width,height);
		xSpeed = 1;
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed) {
		super(x,y,width,height);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, int xSpeed, int ySpeed) {
		super(x,y,width,height);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	public Ball(int x, int y, int width, int height, Color color) {
		super(x,y,width,height,color);
		xSpeed = 1;
		ySpeed = 1;
	}	
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		ySpeed = 1;
	}
	
	public Ball(int x, int y, int width, int height, Color color, int xSpeed, int ySpeed) {
		super(x,y,width,height,color);
		setXSpeed(xSpeed);
		setYSpeed(ySpeed);
	}
	
	   
   //add the set methods
	public void setXSpeed(int x) {
		xSpeed = x;
	}
	
	public void setYSpeed(int y) {
		ySpeed = y;
	}
   

	public void moveAndDraw(Graphics window)
	   {
	   	//draw a white ball at old ball location
		   draw(window,Color.WHITE);
	      setX(getX()+xSpeed);
			//setY
	      setY(getY()+ySpeed);
			//draw the ball at its new location
	      draw(window);
	      
	   }
   
	public boolean equals(Object obj)
	{
		Ball other = (Ball) obj;
		return (this.getX()==other.getX() && this.getY()==other.getY() && this.getWidth()==other.getWidth() && this.getHeight()==other.getHeight()
				&& xSpeed==other.getXSpeed() && ySpeed==other.getYSpeed());
	}   

   //add the get methods
	public int getXSpeed() {
		return xSpeed;
	}
	
	public int getYSpeed() {
		return ySpeed;
	}
   //add a toString() method
	public String toString() {
		return "x: "+getX()+" y: "+getY()+" width: "+getWidth()+" height: "+getHeight()+" color: "+getColor()+" xSpeed: "+getXSpeed()+" ySpeed:."
				+ " "+getYSpeed();
	}
	

	public boolean didCollideLeft(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getX()<=paddle.getX()+paddle.getWidth()&&getX()>paddle.getX()&&(getY()>=paddle.getY() && getY()<=paddle.getY()+paddle.getHeight())){
			return true;
		}
		return false;
	}

	public boolean didCollideRight(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getX()+getWidth()>=paddle.getX()&&getX()<paddle.getX()&&(getY()>=paddle.getY() && getY()<=paddle.getY()+paddle.getHeight())){
			return true;
		}
		return false;
	}

	public boolean didCollideTop(Object obj) {
		Paddle paddle = (Paddle)obj;
		if (getY()+getHeight()>=paddle.getY() && getY() < paddle.getY()+paddle.getHeight() && (getX()>=paddle.getX() && getX()+getWidth()<=paddle.getX()+paddle.getWidth())){
			return true;
		}
		return false;
	}

	public boolean didCollideBottom(Object obj) {
		Paddle paddle = (Paddle) obj;
		if (getY()+getHeight()>paddle.getY() && getY() <= paddle.getY()+paddle.getHeight() && (getX()>=paddle.getX() && getX()+getWidth()<=paddle.getX()+paddle.getWidth())){
					return true;			
				}
		return false;
	}

}