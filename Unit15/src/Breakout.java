import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.Font; //imported this
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;

public class Breakout extends Canvas implements KeyListener, Runnable
{
	private Ball ball;
	private Paddle paddle;
	private boolean[] keys;
	private BufferedImage back;
	private int score;
	private Wall rightWall, leftWall, topWall, botWall;
	private Block[][] blocks;
	//we just need to like fix everything lmao
	public Breakout()
	{
		//set up all variables related to the game
		ball = new Ball();
		paddle = new Paddle(400, 300, 40, 40, Color.RED, 5);
		keys = new boolean[4];
		//score = 0;
		rightWall = new Wall(790, 0, 10, 600, Color.WHITE);
		leftWall = new Wall(0, 0, 10, 600, Color.WHITE);
		topWall = new Wall(0, 0, 800, 10, Color.WHITE);
		botWall = new Wall(0, 590, 800, 10, Color.WHITE);
    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		this.addKeyListener(this);		//starts the key thread to log key strokes
		new Thread(this).start();
		
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
   {
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);

		//see if ball hits left wall or right wall
		//if(!(ball.getX()>=10 && ball.getX()<=780))
		if(ball.getX() <= leftWall.getX() + leftWall.getWidth())
		{
			ball.setXSpeed(-ball.getXSpeed());
			//ball.setYSpeed(0);
		}
		
		if(ball.getX() + ball.getWidth() >= rightWall.getX())
		{
			ball.setXSpeed(-ball.getXSpeed());
			//ball.setYSpeed(0);
		}
	
		//see if the ball hits the bottom wall 
		if(!(ball.getY() >= 10 && ball.getY() <= 580))
		{
			ball.setYSpeed(-ball.getYSpeed());
		}

		//ball hits right side of paddle
		if(ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed())
				&& (ball.getY() >= paddle.getY() 
					&& ball.getY() <= paddle.getY() + paddle.getHeight()
						|| ball.getY() + ball.getHeight() >= paddle.getY() 
						&& ball.getY() + ball.getHeight() < paddle.getY() + paddle.getHeight()))
		{
			System.out.println("h");
			if(ball.getX() <= paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed())) ball.setYSpeed(-ball.getYSpeed());
			else ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		if(keys[0]) paddle.moveUpAndDraw(graphToBack); //need to use graphToBack instead of window 
		if(keys[1]) paddle.moveDownAndDraw(graphToBack);
		if(keys[2]) paddle.moveLeftAndDraw(graphToBack);
		if(keys[3]) paddle.moveRightAndDraw(graphToBack);

		twoDGraph.drawImage(back, null, 0, 0);
	}

	public void keyPressed(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=true; break;
			case 'Z' : keys[1]=true; break;
			case 'A' : keys[2]=true; break;
			case 'D' : keys[3]=true; break;
		}
	}

	public void keyReleased(KeyEvent e)
	{
		switch(toUpperCase(e.getKeyChar()))
		{
			case 'W' : keys[0]=false; break;
			case 'Z' : keys[1]=false; break;
			case 'A' : keys[2]=false; break;
			case 'D' : keys[3]=false; break;
		}
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}	
}