package piggybank;

public class Dime extends Money
{

// Fields
	private int dime;

// constructor
	public Dime(int dime)
	{
		this.dime = dime;
	}

	public Dime()
	{
		this.dime += 1;
	}
	
// Methods
	public double getValue()
	{
		return dime * .10;
	}

	public String getName()
	{
		if(dime > 1) 
		{
			return this.dime + "Dimes";
		} 
		else
		{
			return this.dime + "Dime";
		}
	}
}