package test;

import javax.swing.JOptionPane;

public class Project3AP 
{
	public static void main (String[] args)
	   {
	      int cycle;
	      String sent = "";                                   
	      String input = "";
	      String check = "";
	      
	      sent = JOptionPane.showInputDialog("Enter a sentence my dood");   
	      JOptionPane.showMessageDialog(null, "The original input is: " + sent);
	      
	      sent = sent.replace(" ", "");
	      JOptionPane.showMessageDialog(null, "Removing blanks - " + sent);
	      
	      input = JOptionPane.showInputDialog("Enter a word my dood");   
	      JOptionPane.showMessageDialog(null, "Input word is: " + input);
	      
	      for (cycle = 0; cycle < sent.length(); cycle++)
	      {
	    	  if (sent.substring(cycle, sent.length()-1).contains(input))
	    	  {
	    		 
	    			  JOptionPane.showMessageDialog(null, input + " - was found at location " + sent.indexOf(input));
	    		 
	    	  }
	    	  else
	    	  {
	    		  JOptionPane.showMessageDialog(null, input + " - was not found");
	    	  }
	    	  
	    	  input = input.substring(0, input.length()-1);
	      }             
	   }

}
