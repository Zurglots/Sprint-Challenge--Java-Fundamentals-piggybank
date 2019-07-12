package piggybank;

// imports
import java.util.*;
import java.text.DecimalFormat;

public class Main 
{

	public static void main(String[] args)
	{
		DecimalFormat fp = new DecimalFormat("$###,###.00");

		ArrayList<Money> piggyBank = new ArrayList<>();

		piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		double total = 0;
		for(Money m : piggyBank)
		{
			total += m.getValue();
		}

		// Example sout from read me.
		System.out.println("The piggy bank holds " + fp.format(total));
	}


}