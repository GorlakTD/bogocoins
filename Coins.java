public class Coin
{
	private char type;
	private int value;
	public Coin(String t)
	{
		if (t.equalsIgnoreCase("penny")
			type = 'p';
		if (t.equalsIgnoreCase("nickel")	
			type = 'n';
		if (t.equalsIgnoreCase("dime")
			type = 'd';
			
		if (t.equalsIgnoreCase("quarter")	
			type = 'q';
			
		
	}
	public void setValue(int val)
	{
		
	}
	public void setType(char t)
	{
		
	}
	
	public char getType()
	{
		return this.type;
	}
}
