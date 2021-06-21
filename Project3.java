import javax.swing.JOptionPane;

public class Project3 
{
	public static void main(String[] args) 
	{
	    String h = "Javier Favela's Program";
	    System.out.println(String.format("%60s", h));
	    
	      String lowStr ="", resultLow;                                 
	      int low = 0, again;
	      
	      String highStr = "", resultHigh;
	      int high = 0;

         lowStr = JOptionPane.showInputDialog("Enter the low temperature: ");   
	         
         low = Integer.parseInt(lowStr);

         resultLow = "The low temperature is " + low;
	         
         JOptionPane.showMessageDialog (null, resultLow);    
	         
         highStr = JOptionPane.showInputDialog("Enter the high temperature: ");
	         
         high = Integer.parseInt(highStr);
	         
         resultHigh = "The high temperature is " + high;
	         
         JOptionPane.showMessageDialog (null, resultHigh);  
	         	
	     String rangStr = "", resultRang;
         int rang = high - low;
		     
         resultRang = "The temperature range for the day is " + rang + " degrees";
	         
	     JOptionPane.showMessageDialog (null, resultRang); 
		     
	     String aveStr = "", resultAve;
	     double ave = ((double) high + low) / 2;
		     
	     resultAve = "The average of the temperatures is " + ave + " degrees";
	         
	     JOptionPane.showMessageDialog (null, resultAve);
		     
	     String eqStr = "", resultEq;
	     int eq = high / low;
		     
	     resultEq = "High temp / Low temp \"equals\" " + eq;
	         
	     JOptionPane.showMessageDialog (null, resultEq);
		     
	     String remainStr = "", resultRemain;
	     int remain = high % low;
		     
	     resultRemain = "The remainder from the division is " + remain;
	         
	     JOptionPane.showMessageDialog (null, resultRemain);

	                       

	}
}