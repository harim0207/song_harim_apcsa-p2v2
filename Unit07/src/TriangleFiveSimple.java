
public class TriangleFiveSimple {
	private char letter;
	private int number;
	public TriangleFiveSimple()
	{
		setVal(' ', 0);
	}
	public TriangleFiveSimple(char let,int num)
	{
		setVal(let, num);
	}
	public void setVal(char let, int num)
	{
		letter = let;
		number = num;
	}
	public String Triangle()
	{
		String output = "";
		for(int i=number; i>0; i--)//number of columns per line
		{
			char pc = letter;
			for(int j = number; j> number-i; j--)//how many of each char is printed
			{
				for(int k = 0; k<j; k++)//printing char
				{
					output += pc;
				}
				output += " ";
				pc++;
				if ( pc == '[') pc = 'A';
			}
			output += "\n";
		}
		return output;
	}
	public String toString()
	{
		return "" + Triangle();
	}
}
