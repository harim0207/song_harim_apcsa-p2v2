//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	//add two instance variables
	private int num; private int denom;

	//write two constructors
	public Rational()
	{
		setRational(1, 1);
	}

	public Rational(int a, int b)
	{
		setRational(a, b);
	}
	//write a setRational method
	public void setRational(int a, int b)
	{
		setNum(a);
		setDenom(b);
	}
	//write  a set method for numerator and denominator
	public void setNum(int a)
	{
		num = a;
	}

	public void setDenom(int b)
	{
		denom = b;
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		num= 
		


		reduce();
	}

	private void reduce()
	{



	}

	private int gcd(int numOne, int numTwo)
	{


		return 1;
	}

	public Object clone ()
	{
		return "";
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	
	
	public boolean equals( Object obj)
	{


		return false;
	}

	public int compareTo(Rational other)
	{


		return -1;
	}



	
	//write  toString() method
	
	
}