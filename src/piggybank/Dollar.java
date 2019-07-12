package piggybank;

public class Dollar extends Money
{

// Fields
	private int dollar;

// constructor
	public Dollar(int dollar)
	{
		this.dollar = dollar;
	}

	public Dollar()
	{
		this.dollar += 1;
	}
	
// Methods
	public double getValue()
	{
		return dollar * 1.00;
	}

	public String getName()
	{
		if(dollar > 1) 
		{
			return this.dollar + " Dollars";
		} 
		else
		{
			return this.dollar + " Dollar";
		}
	}
}