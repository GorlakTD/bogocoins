
public class Bogocoins
{
  private ArrayList<ArrayList<Coin>> c = new ArrayList<ArrayList<Coin>>();
  
  private ArrayList<Coin> source = new ArrayList<Coin>();
  private int target = 30;
  public void transmute()
  {
ArrayList<Coin> ref = c.get(c.size);
    for(int i = 0; i < c.size; i++)
    {
      for(int k = 0; k < c.get(i).size; k++)
      {
	if(ref.get(k).getType() == 'p')
		ref.set(k, 'n');
	if(ref.get(k).getType() == 'n')
		ref.set(k, 'd');
	if(ref.get(k).getType() == 'd')
		ref.set(k, 'q');
	c.add(ref);
      }
    }
  }
  public static void main(String[] args)
  {
 ArrayList<Coin> ref = new ArrayList<Coin>();	
    for (int i = 0; i < target; i++)
      ref.add(new Coin("Penny"));
    c.add(ref);
  }
}
