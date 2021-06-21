
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class project5 
{
	public static void main(String[] args) 
	{
		DecimalFormat df = new DecimalFormat("0.00");
		
		String n = "", resultN;
		resultN = "Donuts - Javier Favela";
		
		JOptionPane.showMessageDialog (null, resultN);
		
		String oneStr = "", resultOne;
		double one = 0;
		
		oneStr = JOptionPane.showInputDialog("Enter the cost of 1 donut: ");   
		one = Double.parseDouble(oneStr);
		//resultOne = "The cost of 1 donut: " + one;
		//JOptionPane.showMessageDialog (null, resultOne);
		
		one = one / 1; 
	
		resultOne = "The unit cost of 1 donut: " + df.format(one);
		JOptionPane.showMessageDialog (null, resultOne);
		
		//System.out.println(one);
		
		String sixStr = "", resultSix;
		double six = 0;
		
		sixStr = JOptionPane.showInputDialog("Enter the cost of 6 donuts: ");   
		six = Double.parseDouble(sixStr);
		//resultSix = "The cost of 6 donut: " + six;
		//JOptionPane.showMessageDialog (null, resultSix);
		
		six = six / 6; 
		resultSix = "The unit cost of 6 donuts: " + df.format(six);
		JOptionPane.showMessageDialog (null, resultSix);
		
		//System.out.println(six);
		
		String tweStr = "", resultTwe;
		double twe = 0;
		
		tweStr = JOptionPane.showInputDialog("Enter the cost of 12 donut: ");   
		twe = Double.parseDouble(tweStr);
		//resultTwe = "The cost of 12 donut: " + twe;
		//JOptionPane.showMessageDialog (null, resultTwe);
		
		twe = twe / 12; 
		resultTwe = "The unit cost of 12 donuts: " + df.format(twe);
		JOptionPane.showMessageDialog (null, resultTwe);
		
		//System.out.println(twe);
		
		if (one < six)
		{
			if (one < twe)
			{
				resultOne = "Buying 1 donut is the cheapest per donut";
				JOptionPane.showMessageDialog (null, resultOne);
			}
			else
			{
				resultTwe = "Buying 12 donuts is the cheapest per donut";
				JOptionPane.showMessageDialog (null, resultTwe);
			}
		}
		else
		{
			if (six < twe)
			{
				resultSix = "Buying 6 donuts is the cheapest per donut";
				JOptionPane.showMessageDialog (null, resultSix);
			}
			else
			{
				resultTwe = "Buying 12 donuts is the cheapest per donut";
				JOptionPane.showMessageDialog (null, resultTwe);
			}
		}
		
	}
}
