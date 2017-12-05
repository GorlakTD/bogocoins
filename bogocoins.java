
public class Bogocoins
{
  private ArrayList<ArrayList<Coin>> c = new ArrayList<ArrayList<Coin>>();
  private ArrayList<Coin> ref = new ArrayList<Coin>();
  private ArrayList<Coin> source = new ArrayList<Coin>();
  private int target = 30;
  private int numPennies;
	private int numNickels;
	private int numDimes;
	private int numQuarters;
  public void transmute()
  {
    for(int i = 0; i < c.size; i++)
    {
      for(int k = 0; k < c.get(i).size; k++)
      {
        if (c.get(i).get(k).getType() == 'p');
				{
					c.get(i).remove(k);
					numPennies ++
				}
      }
    }
  }
  public static void main(String[] args)
  {
    for (int i = 0; i < target; i++)
      ref.add(new Coin("Penny"));
    c.add(ref);
    
  }
}
