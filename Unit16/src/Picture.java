import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setGreen(0);
	    	pixelObj.setRed(0);
	    }
	  }
  }
  public void keepOnlyRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setGreen(0);
	    	pixelObj.setBlue(0);
	    }
	  }
  }
  public void keepOnlyGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setBlue(0);
	    	pixelObj.setRed(0);
	    }
	  }
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setBlue(255-pixelObj.getBlue());
	    	pixelObj.setRed(255-pixelObj.getRed());
	    	pixelObj.setGreen(255-pixelObj.getGreen());
	    }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setBlue((pixelObj.getBlue()+ pixelObj.getRed()+pixelObj.getGreen())/3);
	    	pixelObj.setRed((pixelObj.getBlue()+ pixelObj.getRed()+pixelObj.getGreen())/3);
	    	pixelObj.setGreen((pixelObj.getBlue()+ pixelObj.getRed()+pixelObj.getGreen())/3);
	    }
	  }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	    	pixelObj.setBlue(pixelObj.getBlue()-60);
	    	pixelObj.setRed(pixelObj.getRed()+60);
	    	pixelObj.setGreen(pixelObj.getGreen()-80);
	    }
	  }
  }
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel leftPixel = null;
	 Pixel rightPixel = null;
	 int width = pixels[0].length;
	 for (int row = 0; row < pixels.length; row++)
	 {
		 for (int col = 0; col < width / 2; col++)
	   {
	     leftPixel = pixels[row][col];
	     rightPixel = pixels[row][width - 1 - col];
	     leftPixel.setColor(rightPixel.getColor());
	   }
	 } 
  }
  
  public void mirrorHorizontal()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int width = pixels[0].length;
	 for (int row = 0; row < pixels.length/2; row++)
	 {
		 for (int col = 0; col < width; col++)
	   {
	     topPixel = pixels[row][col];
	     bottomPixel = pixels[pixels.length - 1 - row][col];
	     bottomPixel.setColor(topPixel.getColor());
	   }
	 } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
	 Pixel[][] pixels = this.getPixels2D();
	 Pixel topPixel = null;
	 Pixel bottomPixel = null;
	 int width = pixels[0].length;
	 for (int row = 0; row < pixels.length/2; row++)
	 {
		 for (int col = 0; col < width; col++)
	   {
	     topPixel = pixels[row][col];
	     bottomPixel = pixels[pixels.length - 1 - row][col];
	     topPixel.setColor(bottomPixel.getColor());
	   }
	 } 
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
		 Pixel topPixel = null;
		 Pixel bottomPixel = null;
		 int width = pixels[0].length;
		 for (int row = 0; row < pixels.length; row++)
		 {
			 for (int col = 0; col < row; col++)
		   {
		     topPixel = pixels[row][col];
		     bottomPixel = pixels[col][row];
		     bottomPixel.setColor(topPixel.getColor());
		   }
		 } 
  }
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
    System.out.println(count);
  }
  
  public void mirrorArms()
  {
	  int mirrorPoint = 193;
	  Pixel topPixel = null;
	  Pixel botPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for(int row = 161; row < mirrorPoint; row++)
	  {
		  for(int col = 102; col < 295; col++)
		  {
			  topPixel = pixels[row][col];
			  botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
			  botPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorGulls()
  {
	  int mirrorPoint = 347;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	  
	  for(int row = 228; row < 324; row++)
	  {
		  for(int col = 234; col < mirrorPoint; col++)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  rightPixel.setColor(leftPixel.getColor());
		  }
	  }
  }
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("H:\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
    Picture flower2 = new Picture("H:\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("H:\\Unit16-Assignments-pixLab\\images\\collage.jpg");
  }
  
  public void myCollage()
  {
	  Picture flower1 = new Picture("H:\\Unit16-Assignments-pixLab\\images\\flower1.jpg");
	  Picture flower2 = new Picture("H:\\Unit16-Assignments-pixLab\\images\\flower2.jpg");
	  this.copy(flower1, 50, 100);
	  this.copy(flower2, 50,300);
	  this.copy(flower1, 50,500);
	  this.mirrorHorizontal();
	  this.write("H:\\Unit16-Assignments-pixLab\\images\\collage.jpg");
  }
  
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;

    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        Color save = leftPixel.getColor();
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        
        if (leftPixel.colorDistance(rightColor) > edgeDist) 
        {
        	leftPixel.setColor(Color.BLACK);
        	continue;
        }
        else leftPixel.setColor(Color.WHITE);
        if(row < pixels.length-1)
        {
        	botPixel = pixels[row + 1][col];
        	if(botPixel.colorDistance(save) > edgeDist) leftPixel.setColor(Color.BLACK);
        	else leftPixel.setColor(Color.WHITE);	
        }  
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
	  	Pixel leftPixel = null;
		Pixel rightPixel = null;
		Pixel botPixel = null;
		Pixel diagPixel = null;
		Pixel[][] pixels = this.getPixels2D();
		Color rightColor = null;
		
		for (int row = 0; row < pixels.length; row++)
		{
		  for (int col = 0; col < pixels[0].length-1; col++)
		  {
		    leftPixel = pixels[row][col];
		    rightPixel = pixels[row][col + 1];
		    
		    if(row < pixels.length - 1 && col < pixels[row].length - 1)
		    {	    	
			    botPixel = pixels[row + 1][col];
		    	diagPixel = pixels[row + 1][col + 1];
			    Color avg = avgColor(botPixel, rightPixel, diagPixel);
		    	if(leftPixel.colorDistance(avg) > edgeDist) leftPixel.setColor(Color.BLACK);
		    	else leftPixel.setColor(Color.WHITE);
		    }
		    else if(row < pixels.length-1)
		    {
		    	botPixel = pixels[row + 1][col];
		    	if(leftPixel.colorDistance(botPixel.getColor()) > edgeDist) leftPixel.setColor(Color.BLACK);
		    	else leftPixel.setColor(Color.WHITE);
		    }
		    else
		    {
		    	if(leftPixel.colorDistance(rightPixel.getColor()) > edgeDist) leftPixel.setColor(Color.BLACK);
		    	else leftPixel.setColor(Color.WHITE);
		    }
		    
		    
		     
		  }
		}
  }
  
  /*public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;

	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
	  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
			  currPixel.setRed(currPixel.getRed() - 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
			  currPixel.setRed(currPixel.getRed() + 1);
			  count++;
			  }
		  }
	  }
	  System.out.println(count);
  }
  
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  	for (int col = 0; col < this.getWidth(); col++)
		  	{
		  		currPixel = pixels[row][col];
		  		messagePixel = messagePixels[row][col];
		  		if (currPixel.getRed() % 2 == 1)
		  		{
		  			messagePixel.setColor(Color.BLACK);
		  			count++;
		  		}
		  	}
	  }
	  System.out.println(count);
	  return messagePicture;
  }*/
  
  public void encode(Picture messagePict)
  {
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  int mod = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  messagePixel = messagePixels[row][col];
			  currPixel = currPixels[row][col];
			  mod = (currPixel.getBlue() + currPixel.getGreen() + currPixel.getRed())%4;
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
				  if (mod >0)
				  {
					  if(currPixel.getBlue() == 0)
					  { currPixel.setBlue(currPixel.getBlue() + 3);  mod--;}
					  else {currPixel.setBlue(currPixel.getBlue() - 1); mod--;}
				  }
				  if (mod >0)
				  {
					  if(currPixel.getGreen() == 0)
					  { currPixel.setGreen(currPixel.getGreen() + 3);  mod--;}
					  else {currPixel.setGreen(currPixel.getGreen() - 1); mod--;}
				  }
				  if (mod >0)
				  {
					  if(currPixel.getRed() == 0)
					  { currPixel.setRed(currPixel.getRed() + 3);  mod--;}
					  else {currPixel.setRed(currPixel.getRed() - 1); mod--;}
				  }
				  count++;
			  }
			  else
			  {
				  if(mod == 0)
				  {
					  if(currPixel.getBlue() == 255)
						  currPixel.setBlue(currPixel.getBlue() - 1); 
					  else currPixel.setBlue(currPixel.getBlue() + 1);
				  }
			  }
		  }
	  }
	  System.out.println(count);
  }
  
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  	for (int col = 0; col < this.getWidth(); col++)
		  	{
		  		currPixel = pixels[row][col];
		  		messagePixel = messagePixels[row][col];
		  		if ((currPixel.getRed() + currPixel.getBlue() + currPixel.getGreen())%4 == 0)
		  		{
		  			messagePixel.setColor(Color.BLACK);
		  			count++;
		  		}
		  	}
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  private Color avgColor(Pixel one, Pixel two, Pixel three)
  {
	  int greenAvg = (one.getGreen() + two.getGreen() + three.getGreen())/3;
	  int blueAvg = (one.getBlue() + two.getBlue() + three.getBlue())/3;
	  int redAvg = (one.getRed() + two.getRed() + three.getRed())/3;
	  return new Color(redAvg, greenAvg, blueAvg);
  }
  
  public static void main(String[] args) 
  {
    Picture beach = new Picture("H:\\Unit16-Assignments-pixLab\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
