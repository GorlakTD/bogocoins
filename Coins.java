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
	public boolean setValue(int val)
	{
		if(val == 1 || val == 5 || val == 10 || val == 25)
		{
			this.value = val;
			this.type = setType(val)
			return true;
		}
		else
			return false;
	}
	public void setType(int val)
		if(val == 1)
		    {
				return 'p';
		    }
		if(val == 5)
			{
				return 'n';
			}
    		if(val == 10)
			{
				return 'd';
			}
	    	if(val == 1)
			{
				return 'q';
			}
	public char getType()
	{
		return this.type;
	}
}
