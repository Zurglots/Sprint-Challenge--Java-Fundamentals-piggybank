package piggybank;

public class Nickel extends Money
{

// Fields
	private int nickel;

// constructor
	public Nickel(int nickel)
	{
		this.nickel = nickel;
	}

	public Nickel()
	{
		this.nickel += 1;
	}
	
// Methods
	public double getValue()
	{
		return nickel * .05;
	}

	public String getName()
	{
		if(nickel > 1) 
		{
			return this.nickel + " Nickels";
		} 
		else
		{
			return this.nickel + " Nickel";
		}
	}
}