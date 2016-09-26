package skewll.reviews;
public class Voting 
{
	Party[] parties = new Party[4];
	public void setArray(int address, Party value)
	{
		parties[address] = value;
	}
	public void getResult()
	{
		int maxParty = 0;
		boolean tie = false;
		for(int i = 0; i < parties.length; i++)
		{
			if(parties[i].getTally() > parties[maxParty].getTally())
			{
				maxParty = i;
			}
		}
		for(int i = 0; i < parties.length; i++)
		{
			if(i != maxParty && parties[i].getTally() == parties[maxParty].getTally())
			{
				tie = true;
			}
		}
		if(!tie)
		{
			System.out.println(parties[maxParty].getName() + " is the winner!");
		}
		else
		{
			System.out.println("There's a tie!");
		}
		
	}
}
