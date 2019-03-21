//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("C:\\Users\\hsong\\Desktop\\APCSA\\EclipseWork\\song_harim_apcsa-p2v2\\Unit12new\\src\\words.dat"));

		int size = file.nextInt();
		
		Word[] list = new Word[size];
		
		for(int i = 0; i < size; i++)
		{
			list[i] = new Word(file.next());
		}
		
		Arrays.sort(list);
	
		System.out.println(Arrays.toString(list));
	}
}