import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Project8 
{
	public static void main(String[] args)
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		String title = "", resultT;
		resultT = "Paycheck Output - Javier Favela";
		JOptionPane.showMessageDialog (null, resultT);
		
		int workers = 0;
		
		while (workers < 3)
		{
			String wName = "", resultW;
			wName = JOptionPane.showInputDialog("Enter a name: ");
			
			String hoursStr = "", resultHours;
			int hours = 0;
			hoursStr = JOptionPane.showInputDialog ("Enter the amount of hours worked: ");
			hours = Integer.parseInt(hoursStr);
			//System.out.println (hours);
			
			String payStr = "", resultPay;
			double pay = 0;
			payStr = JOptionPane.showInputDialog("Enter the amount of pay: ");
			pay = Double.parseDouble(payStr);
			//System.out.println (pay);
			
			
			if (hours <= 40)
			{
				resultHours = "For this week, you worked " + hours + " hours @" + df.format(pay) + " per hour and were paid $" + df.format(hours * pay) + " before taxes.";
				JOptionPane.showMessageDialog (null, resultHours);
			}
			else
			{
				if (hours < 80)
				{
					int hoursOver = hours - 40;
					double pay15 = (double) pay * 1.5;
					double paid = (double) (hoursOver * pay15) + (40 * pay);
					
					resultHours = "For this week, you worked " + hours + " hours @" + df.format(pay) + " per hour and were paid $" + df.format(paid)+ " before taxes.";
					JOptionPane.showMessageDialog (null, resultHours);
				}
				else
				{
					
					double pay15 = pay * 1.5;			
					int hoursOver = hours - 80;
					double pay20 = pay * 2;
					double paid = (double) (hoursOver* pay20) + (40 * pay15) + (40 * pay);
					
					resultHours = "For this week, you worked " + hours + " hours @" + df.format(pay) + " per hour and were paid $" + df.format(paid) + " before taxes.";
					JOptionPane.showMessageDialog (null, resultHours);
				}
			}
			workers++; 
		}
	}
}
