
import javax.swing.JOptionPane;

public class Project16 
{	
	public static void main (String[] args)
	{
		String ask = "", asked;
		int followup;
		int done;
		int cycle, cycled;
		
		Recursion fact = new Recursion(); 

		ask = JOptionPane.showInputDialog("Enter a number or you a fool! ");
		followup = Integer.parseInt(ask);
		done = fact.factorial(followup);
		
		for (cycle = 1; cycle <= followup; cycle++)
		{
			cycled = fact.factorial(cycle);
			System.out.println(cycled);
		}
		
		asked = "The final factorial of your number, " + followup + ", is: " + done;
		System.out.println ("\n" + asked);
		
	}

}
