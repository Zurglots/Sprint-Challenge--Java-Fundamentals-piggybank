package piggybank;

public class Quarter extends Money
{

// Fields	
	private int quarter;

// Constructor
	public Quarter(int quarter)
	{
		this.quarter = quarter;
	}

	public Quarter()
	{
		this.quarter += 1;
	}

// Methods
	public double getValue()
	{
		return quarter * .25;
	}

	public String getName()
	{
		if(quarter > 1) 
		{
			return this.quarter + " Quarters";
		} 
		else
		{
			return this.quarter + " Quarter";
		}
	}
}