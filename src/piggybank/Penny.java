package piggybank;

public class Penny extends Money
{

// Fields
	private int penny;

// constructor
	public Penny(int penny)
	{
		this.penny = penny;
	}

	public Penny()
	{
		this.penny += 1;
	}
	
// Methods
	public double getValue()
	{
		return penny * .01;
	}

	public String getName()
	{
		if(penny > 1) 
		{
			return this.penny + "Pennies";
		} 
		else
		{
			return this.penny + "Penny";
		}
	}
}